package Object;

public class Headphone {
    String colour="red";
    String type="wireless";
    String[] controls={"+","-","on","off"};
    int volume=0;
    boolean on = false;
    public void powerOn()
    {
        on=true;
        System.out.println("Headphones connected successfully");
    }
    public void powerOff()
    {
        on=false;
        System.out.println("Headphones disconnected");
    }
    public void volumeUp()
    {
        volume++;
        System.out.println("Incresed volume, now current volume is "+volume);
    }
    public void volumeDown()
    {
        volume--;
        System.out.println("Decresed volume, now current volume is "+volume);
    }
}
