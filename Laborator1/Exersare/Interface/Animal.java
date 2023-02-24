package Interface;
//In the example, we define two interfaces: Animal with two abstract methods
// interface methods are abstract by default and Bird with two static fields and an abstract method.
interface Animal {
    public void eat();//abstracta
    public void sound();
}
interface Bird
{
    int numberOfLegs=2;
    String outerCovering="pene";
    public void fly();
}
class Eagle implements Animal,Bird
{
    public void eat()
    {
        System.out.println("reptile si amfibieni");
    }

    public void sound() {
        System.out.println("sunet ascutit");
    }

    @Override
    public void fly() {
        System.out.println("Zboara la altitud mai mari de 10000 cv");
    }
}
class TestEagle
{
    public static void main(String args[])
    {
        Eagle e=new Eagle();
        e.eat();
        e.sound();
        e.fly();
        System.out.println(e.numberOfLegs);
        //accesam numberoflegs de la bird

        System.out.println(Bird.numberOfLegs);
    }
}