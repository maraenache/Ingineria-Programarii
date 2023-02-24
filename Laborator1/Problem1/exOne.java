package exOne;

class Human
{
    String firstName;
    String secondName;
    double height;
    double weight;
    int age;
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
   public void setSecondName(String secondName)
   {
       this.secondName=secondName;
   }
    public void setHeight(double height)
    {
        this.height=height;
    }
    public void setWeight(double weight)
    {
        this.weight=weight;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getSecondName()
    {
        return secondName;
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
    public int getAge() {
        return age;
    }
}
//STATIC POLIMORFISM-OVERLOAD
class Chef
{
    public void makeSalad()
    {
        System.out.println("The chef is making a salad");
    }
    public void makeSalad(String ingredient)
    {
        System.out.println("The chef is making a salad with "+ingredient);
    }
    public void makeSalad(String ingredient1,String ingredient2)
    {
        System.out.println("The chef is making a salad with "+ ingredient1+ " and "+ingredient2);
    }
}
//DYNAMIC POLIMORFISM
class Bird
{
    public void sing()
    {
        System.out.println("cip cirip");
    }
}
class Pelican extends Bird
{
    public void sing()
    {
        System.out.println("KWA KWA");
    }
}
class Pigeon extends Bird
{
    public void sing()
    {
        System.out.println("GLU GLU");
    }
}
//INHERITANCE
class Building
{
    int numberOfFloors=4;
    String Adress="Iasi, Romania";
    public void demolish()
    {
        System.out.println("The building was demolished");
    }
}
class Museum extends Building
{
    String museumName="Museum of illusion";
    int tiketPrice=50;
}
class Palace extends Building
{
    int numberOfRooms=12;
    public void clock()
    {
        System.out.println("Ding Dong!");
    }
}
interface Programers
{
    public void code();
    public void eat();
}
class JavaProgramers implements Programers
{
    public void code()
    {
        System.out.println("JavaProgrammers code in Java");
    }
    public void eat()
    {
        System.out.println("JavaProgrammers eat 3 times a day");
    }
}
class CProgramers implements Programers
{
    @Override
    public void code() {
        System.out.println("Cprogrammers code in C");
    }

    @Override
    public void eat() {
        System.out.println("Cprogrammers eat 2 times a day");
    }
}
abstract class Worker
{
    public abstract void occupation();
    public abstract void sleepSchedule();
    public void pay()
    {
        System.out.println("This person is getting paid for his job");
    }
    public void signContract()
    {
        System.out.println("Contract Signed");
    }
}
class SoftwareEngineer extends Worker
{
    public void occupation()
    {
        System.out.println("The sofware engineer codes programs");
    }
    public void sleepSchedule()
    {
        System.out.println("The software engineer sleeps 6 hours");
    }
}
class Doctor extends Worker
{
    public void occupation()
    {
        System.out.println("The doctor saves lives");
    }
    public void sleepSchedule()
    {
        System.out.println("The doctor sleeps 8 hours");
    }
}

class Test
{
    public static void TestEncapsulation() {//nu trb sa creez instanta pt a putea accesa metoda
        Human human = new Human();
        human.setFirstName("Mara");
        human.setSecondName("Enache");
        human.setAge(19);
        human.setHeight(158);
        human.setWeight(53.5);

        System.out.println("Ecapsulation Test:");
        System.out.println("Human named:"+human.getFirstName()+" "+human.getSecondName());
        System.out.println("age:"+human.getAge());
        System.out.println("height:"+human.getHeight());
        System.out.println("weight:"+human.getWeight());
        System.out.println("Encapsulation works");
    }
    public static void TestStaticPolimorfism()
    {
        Chef myChef=new Chef();
        myChef.makeSalad();
        myChef.makeSalad("tomatoes");
        myChef.makeSalad("tomatoes","cucumbers");
    }
    public static void TestDynamicPolimorfism()
    {
        Bird bird=new Bird();
        bird.sing();
        Pigeon pigeon=new Pigeon();
        pigeon.sing();
        Pelican pelican=new Pelican();
        pelican.sing();
    }
    public static void TestInheritance()
    {
        Building building=new Building();
        System.out.println("Adress " + building.Adress);
        System.out.println("Number of flors "+building.numberOfFloors);
        building.demolish();
        Museum museum=new Museum();
        System.out.println("Adress " +  museum.Adress);
        System.out.println("Number of flors "+museum.numberOfFloors);
        System.out.println("Name  "+museum.museumName);
        System.out.println("Ticket price  "+museum.tiketPrice);
        museum.demolish();
        Palace palace=new Palace();
        System.out.println("Adress" +  palace.Adress);
        System.out.println("Number of flors "+palace.numberOfFloors);
        System.out.println("Number of rooms "+palace.numberOfRooms);
        palace.clock();
        palace.demolish();
    }
    public static void TestInterface()
    {
        JavaProgramers javaProgramers=new JavaProgramers();
        javaProgramers.code();
        javaProgramers.eat();
        CProgramers cProgramers=new CProgramers();
        cProgramers.code();
        cProgramers.eat();
    }
    public static void TestAbstraction()
    {
        SoftwareEngineer softwareEngineer=new SoftwareEngineer();
        softwareEngineer.occupation();
        softwareEngineer.sleepSchedule();
        softwareEngineer.pay();
        softwareEngineer.signContract();
        Doctor doctor=new Doctor();
        doctor.occupation();
        doctor.sleepSchedule();
        doctor.pay();
        doctor.signContract();
    }
}
public class exOne {
    public static void main(String args[]) {
        //encapsulation
        Test.TestEncapsulation();
        System.out.println("\n");
        //static polimorfism
        Test.TestStaticPolimorfism();
        System.out.println("\n");
        //dynamic polimorfism
        Test.TestDynamicPolimorfism();
        System.out.println("\n");
        Test.TestInheritance();
        System.out.println("\n");
        Test.TestInterface();
        System.out.println("\n");
        Test.TestAbstraction();
    }
}
