package Abstraction;

abstract class Dog {
    public void bark()
    {
        System.out.println("ham!");
    }
    abstract void presentsItself();
}
class Chiuaua extends Dog{
    void presentsItself() {
        System.out.println("Hi! i m a chiuaua");
    }
}
class Rasa2 extends Dog{
    void presentsItself() {
        System.out.println("Hi! i m a rasa2");
    }
}
class Test
{
    public static void main(String args[])
    {
        Chiuaua c= new Chiuaua();
        c.bark();
        c.presentsItself();
        Rasa2 r= new Rasa2();
        r.bark();
        r.presentsItself();
    }


}
