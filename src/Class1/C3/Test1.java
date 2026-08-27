/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 22, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Class1.C3;

public class Test1 
{
    public static void main(String [] s)
    {
        Student S1 = new Student();
        System.out.println("id: " + S1.getId() + ", " +
                S1.getName() +", count: " + Student.count);
        
        Student S2 = new Student(2, "Ahmed");
        System.out.println("id: " + S2.getId() + ", " +
                S2.getName() +", count: " + Student.count);
          
        Student S3 = new Student(3, "Ali");
        System.out.println("id: " + S3.getId() + ", " +
                S3.getName() +", count: " + Student.count);
        
        //call static method to change static variable
        Student.changeStudentCount(10);

        Student S4 = new Student(4, "Ali");
        System.out.println("id: " + S4.getId() + ", " +
                S4.getName() +", count: " + Student.count);
        //note student count changed         
    }
    
}
