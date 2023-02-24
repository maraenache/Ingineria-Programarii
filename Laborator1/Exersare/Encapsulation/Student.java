package Encapsulation;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class Student {
    private int age;
    private String name;
    public void setAge(int newAge)
    {
        age=newAge;
    }
    public void setName(String name)
    {
        this.name=name;//sau asa, param acelasi nume, cand pun this ma refer la camp
    }
     public void getAge()
     {
         System.out.println(age);
     }
     public void getName()
     {
         System.out.print(name);
     }
}
class TestStudent
{
    public static void main(String args[]){
        Student s= new Student();
    /* inainte
        //practic putem atribui cu egal
        //dar daca facem campurile private nu mai merge
        //encaps-e sa lucram cu metode in loc de variabile, pt ca daca aveam
        //mainul in alt fisier, nu stiam exact care s variab
        s.age=24;
        s.name="Suzzy";
        System.out.println(s.age+s.name);
    */
        s.setAge(24);
        s.setName("suzzy");
        s.getAge();
        s.getName();
    }


}
