package Polymorfism;

/**
 * Java provides two ways to implement polymorphism: method overloading and method overriding.
 */
public class Types {

}
//STATIC POLIMORFISM-METHOD OVERLOADING//PARAM DIF
class  Bird2  {
    public  void  fly()  {
        System.out.println("The bird is flying.");
    }
    public  void  fly(int height)  {
        System.out.println("The bird is flying "  + height +  " feet high.");
    }
    public  void  fly(String name,  int height)  {
        System.out.println("The "  + name +  " is flying "  + height +  " feet high.");
    }
}
class  TestBirdStatic  {
    public  static  void  main(String[] args)  {
        Bird2 myBird =  new Bird2();
        myBird.fly();
        myBird.fly(10000);
        myBird.fly("eagle", 10000);
    }
}
//DYNAMIC POLIMORFISM-METHOD OVERRIDING
class  Animal  {
    public  void  eat()  {
        System.out.println("This animal eats insects.");
    }
}
class  Fish  extends Animal {
    public  void  eat()  {
        System.out.println("This bird eats fishfood.");
    }
}
class  TestFishDynamic  {
    public  static  void  main(String[] args)  {
        Animal myAnimal =  new Animal();
        myAnimal.eat();
        Fish myFish =  new Fish();
        myFish.eat();
    }
}