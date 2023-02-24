package Object;

public class Main {
    public static void main(String[] args) {
        Pen p =new Pen();
        System.out.println(p.colour);
        System.out.println(p.type);
        System.out.println(p.capacPus);
        p.deschid();
        System.out.println(p.capacPus);
        p.inchid();
        System.out.println(p.capacPus);

        Headphone h=new Headphone();
        System.out.println(h.colour);
        System.out.println(h.type);
        System.out.println(h.on);
        h.powerOn();
        System.out.println(h.on);
        h.powerOff();
        System.out.println(h.on);
        System.out.println(h.volume);
        h.volumeUp();
        h.volumeUp();
        h.volumeUp();
        h.volumeUp();
        h.volumeDown();
        h.volumeDown();
        h.volumeDown();
        h.powerOff();

    }
}