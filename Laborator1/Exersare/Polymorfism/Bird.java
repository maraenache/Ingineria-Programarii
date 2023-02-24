package Polymorfism;

public class Bird {
    public void sing()
    {
        System.out.println("tweet tweet");
    }
}
class Robin extends Bird
{
    public void sing()//override
    {
        System.out.println("twidle twidleee");//tot canta dar canta alfel
    }
}
class Pelican extends Bird
{
    public void sing()
    {
        System.out.println("KWA KWA");
    }
}
class PasOverload extends Bird
{
    public void sing(String song){
        System.out.println(song);

    }
}
class TestBird
{
    public static void main(String args[])
    {
        Bird b=new Bird();
        b.sing();
        Robin r=new Robin();
        r.sing();
        Pelican p=new Pelican();
        p.sing();
        PasOverload o=new PasOverload();//!!!!!!aici avem overload adica pot apela fara param
        //si merge la sing de la Bird
        //sau apelex cu param si merge la sing de la pasoverload
        o.sing("lalalalalal");
        o.sing();
    }
}
