package ex1;

import java.util.Vector;

class Human
{
    private String firstName;
    private String lastName;
    private int CNP;

    public Human (String firstName, String lastName, int CNP)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.CNP = CNP;
    }

    public String getFirstName ()
    {
        return firstName;
    }

    public String getLastName ()
    {
        return lastName;
    }

    public int getCNP ()
    {
        return CNP;
    }

}
class Doctor extends Human
{
    public String department;

    Vector<Patient> listPatients = new Vector <> ();

    public Doctor (String firstName, String lastName, int CNP, String department, Vector <Patient> listPatients)
    {
        super(firstName, lastName, CNP);
        this.department = department;
        this.listPatients = listPatients;
    }

    public String getDepartment ()
    {
        return department;
    }

    void addPatient (Patient patient)
    {
        listPatients.add(patient);
    }

    Patient getPacient (int number)
    {
        return listPatients.elementAt(number);
    }
}


class Patient extends Human
{
    Vector<String> diagnostics= new Vector<String>();

    public Patient (String firstName, String lastName, int CNP, Vector<String> diagnostics)
    {
        super(firstName, lastName, CNP);
        this.diagnostics = diagnostics;
    }
    public String getDiagnostic(int number) {

       return diagnostics.elementAt(number);
    }
    public String getDiagnostics() {
        return "{" +
                "diagnostics=" + diagnostics +
                '}';
    }
    void addDiagnostic (String disease)
    {
        diagnostics.add(disease);
    }

}
public class LabOneEx {
    public static void main(String[] args) {

        Vector<String> pac1Diagnostic = new Vector<>();

        pac1Diagnostic.add("heart");//heart

        Vector<String> pac2Diagnostic = new Vector<>();

        pac2Diagnostic.add("lung");//heart

        Vector<String> pac3Diagnostic = new Vector<>();

        pac3Diagnostic.add("heart");//heart
        pac3Diagnostic.add("lung");//heart


        Patient patient1 = new Patient("Andrei", "Pac1", 990, pac1Diagnostic);
        Patient patient2 = new Patient("Andreea", "Pac2", 991, pac2Diagnostic);
        Patient patient3 = new Patient("Andra", "Pac3", 992, pac3Diagnostic);

        Vector<Patient> listPacients = new Vector<>();
        listPacients.add(patient1);//heart
        listPacients.add(patient2);//heart
        listPacients.add(patient3);


        Vector<Patient> listDoc1 = new Vector<>();
        Vector<Patient> listDoc2 = new Vector<>();

        listDoc1.add(patient1);//heart
        listDoc1.add(patient3);


        listDoc2.add(patient2);//lung
        listDoc2.add(patient3);

        Doctor doctor1 = new Doctor("Andrei", "DOC1", 111, "cardiology", listDoc1);
        Doctor doctor2 = new Doctor("Mihai", "DOC2", 112, "pneumology", listDoc2);

        System.out.println("Doctor1:\n");
        System.out.println("Name: " + doctor1.getFirstName() + " " + doctor1.getLastName());
        System.out.println("CNP: " + doctor1.getCNP());
        System.out.println("Department: " + doctor1.getDepartment());
        int number=-1;
        for(Patient patient:doctor1.listPatients) {
            number++;
            System.out.println("Patient " + ": " + doctor1.getPacient(number).getFirstName() + " "
                    + doctor1.getPacient(number).getLastName() +
                    ", " + doctor1.getPacient(number).getDiagnostics());
        }
        System.out.println("\n");
        System.out.println("Doctor2:\n");
        System.out.println("Name: " + doctor2.getFirstName() + " " + doctor2.getLastName());
        System.out.println("CNP: " + doctor2.getCNP());
        System.out.println("Department: " + doctor2.getDepartment());
        number=-1;
        for(Patient patient:doctor2.listPatients) {
            number++;
            System.out.println("Patient " + ": " + doctor2.getPacient(number).getFirstName() + " "
                    + doctor2.getPacient(number).getLastName() +
                    ", " + doctor2.getPacient(number).getDiagnostics());
        }

    }
}