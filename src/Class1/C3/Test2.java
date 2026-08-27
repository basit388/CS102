/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 22, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Class1.C3;

public class Test2 
{
    public static void main(String [] s)
    {

        Student S1 = new Student(1, "Ali");
        System.out.println("id: " + S1.getId() + ", " +
                S1.getName() +", count: " + Student.count);
        
        //call static method to change static variable
        //Note: the change is made to the class and
        //      NOT to the object
        Student.changeStudentCount(24);
        //now count is 24.
        
        Student S2 = new Student(2, "Ali");
        //count becomes 25.
        
        if(S2.MAX_STUDENTS == 25)
        {
            Student.count = 0;
        }
        //count becomes 0
        
        System.out.println("id: " + S2.getId() + ", " +
                S2.getName() +", count: " + Student.count);
        //note student count changed 

        //final cannot be changed
        
        //  S2.MAX_STUDENTS = 50;
        
    }
    
}
