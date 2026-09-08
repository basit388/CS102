package Class1.Lab4.Ex3;

/*
Exercise 5
- Make a date object D1. set your date of birth.
- Make a date object D2. set your date of joining PSU.
- Make Student object S1. Use default constructor to initialize. 
- Set D1 and D2 as Student.birthDate and Student.enrolledDate

- Make another Student object S2. Use parameterized constructor to initialize values.
- provide birthDate and enrolledDate for Student S2.
- test if birthDate and enrolledDate for S1 are equal or not
- test if birthDate and enrolledDate for S2 are equal or not

*/

public class Test {
    
    public static void main(String[] args) {
        
        Date D1=new Date(1,1,2010);
        Date D2=new Date(1,9,2025);
        Student S1=new Student();
        S1.birthDate=D1;
        S1.enrolledDate=D2;
        
        Student S2= new Student(123,"Ahmed",3.5,
        new Date(1,1,2004),
        new Date(1,9,2025));
        
        System.out.println(S1.birthDate.equals(S2.birthDate));
        System.out.println(S1.enrolledDate.equals(S2.enrolledDate));
        
        
    }
}
    

