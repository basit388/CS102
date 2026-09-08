package Class1.Lab4.Ex3;
/*
Exercise 5
Class Student is given with the following details:
- public int id
- protected String name
- private double gpa
- protected Date birthDate;
- protected Date enrolledDate;

- write a default and parameterized constructor
- write toString method
- write a setter method that sets the appropriate values

*/
public class Student 
{
    public int id;
    protected String name;
    private double gpa;
    protected Date birthDate;
    protected Date enrolledDate;
    Student()
    {
        this.id=0;
        this.name="";
        this.gpa=0;
        birthDate = new Date();
        enrolledDate = new Date();       
    }
    Student(int id, String name, double gpa, Date D1, Date D2){
        this.id=id;
        this.name=name;
        this.gpa=gpa;
        birthDate = new Date(D1);
        enrolledDate = new Date(D2);
    }
    public double getGPA(){
        return gpa;
    }
    public void setGPA(double d){
        gpa=d;
    }
    public String toString(){
        return "("+id+", "+name+", "+gpa+", "
                +birthDate.toString()+", "
                +enrolledDate.toString()+")";
    }
    
}
