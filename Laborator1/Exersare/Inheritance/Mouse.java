package Inheritance;
//cand am o categorie generala, creez o clasa parinte
//iar subclasele mostenesc metodele astfel evitam sa ne repetam
public class Mouse {
    public void rightClick()
    {
        System.out.println("Right click pressed");
    }
    public void leftClick()
    {
        System.out.println("Left click pressed");
    }
    public void scrollUp()
    {
        System.out.println("scrolled up");
    }
    public void scrollDown()
    {
        System.out.println("scrolled down");

    }
}
class Mouse1 extends Mouse{
    public void connect()//mosteneste de sus caracterist de la mouse dar are si ale lui
    {
        System.out.println("Connected succesfully");
    }
}
class Mouse2 extends Mouse
{
    boolean ambidextreus=true;
}
class Mouse3 extends Mouse
{
    public void buttonUnder()
    {
        System.out.println("you press a new button");
    }
}
class TestMouse
{
    public static void main(String args[])
    {
        Mouse1 m1 =new Mouse1();
        Mouse2 m2 =new Mouse2();
        m1.connect();
        m1.rightClick();
        m1.leftClick();
        m1.scrollDown();
        System.out.println(m2.ambidextreus);
        m2.rightClick();
        m2.rightClick();
        m2.scrollDown();
    }
}