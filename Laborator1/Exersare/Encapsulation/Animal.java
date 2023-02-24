package Encapsulation;
/**
 * Encapsulation helps with data security, allowing you to protect the data stored in a class
 * from system-wide access. As the name suggests, it safeguards the internal contents
 * of a class like a capsule.
 *
 *  You can implement encapsulation in Java by making the fields (class variables) private and
 *  accessing them via their public getter and setter methods.
 */

public class Animal {
    private String name;
    private double averageWeight;
    private int numberOfLegs;

    public void setName(String name) {
        this.name = name;
    }
    public void setAverageWeight(double averageWeight)
    {
        this.averageWeight=averageWeight;
    }
    public void setNumberOfLegs(int numberOfLegs)
    {
        this.numberOfLegs=numberOfLegs;
    }
    public String getName()
    {
        return name;
    }
    public double getAverageWeight()
    {
        return averageWeight;
    }
    public int getNumberOfLegs()
    {
        return numberOfLegs;
    }
}
class TestAnimal
{
    public static void main(String args[])
    {
        Animal a= new Animal();
        a.setName("leutu");
        a.setAverageWeight(66.45);
        a.setNumberOfLegs(4);

        System.out.println(a.getName()+a.getAverageWeight()+a.getNumberOfLegs());

    }
}

