package Inheritance;

/**
 * Inheritance makes it possible to create a child class that inherits the fields and methods of the parent
 * class. The child class can override the values and methods of the parent class,
 * but it’s not necessary. It can also add new data and functionality to its parent.
 */
public class Animal {
    public void breathe()
    {
        System.out.println("breathe");
    }
    boolean alive=true;
}
class Dog extends Animal
{
    int numberOfLegs=4;
    public void bark()
    {
        System.out.println("ham");
    }

}
class Chiuaua extends Dog{
    double avgWeigth=23.66D;
    public String rasa="Chiuaua";
    int lifespan=10;
}
class TestChiuaua
{
    public static void main(String args[])
    {
        Dog d= new Dog();
        System.out.println(d.alive);
        System.out.println("number of legs" +d.numberOfLegs);
        Chiuaua c =new Chiuaua();
        System.out.println("A chiuaua as animal"+c.alive);
        c.breathe();
        System.out.println("A chiuaua as dog has "+c.numberOfLegs+"legs");
        c.bark();
        System.out.println("a chiuaua lives"+c.lifespan+"and has on avg" +c.avgWeigth+"kg");


    }
}
