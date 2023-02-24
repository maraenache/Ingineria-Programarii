package Abstraction;
//Partial abstraction (0-100%) can be achieved with abstract classes
//pot pune si clase anstracte si clase concrete, ideea e pt organizare
//clasele abstracte nu se pot instantia, ci au doar rol de parinti
//clasele concrete apar automat in subclase
//metodele abstracte nu trb sa aiba {} continut gen
//e asem cu interface dar acolo sunt numai abstractizate
//intr un fel cand am o categorie sa stiu ce ar trebui neap sa faca si fac diferit pun cu abstract
//iar ce trb sa faca dar fac la fel pun cu concret
abstract class Animal {
    abstract void move();
    abstract void eat();
    public void label() {
        System.out.println("Animal s data");
    }
}
class Bird extends Animal
{
    public void move()
    {
        System.out.println("Zboara");
    }
    public void eat()
    {
        System.out.println("Mananca mancare de pasari");
    }
}
class Fish extends Animal
{
    public void move()
    {
        System.out.println("Inoata");
    }
    public void eat()
    {
        System.out.println("Mananca mancare de pesti");
    }
}
class TestBird
{
    public static void main(String[] args) {

        Bird b =new Bird();
        b.label();
        b.move();
        b.eat();
    }
}
class TestFish
{
    public static void main(String[] args) {
        Fish f=new Fish();
        f.label();
        f.move();
        f.eat();
    }
}
