/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 22, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Class1.C5;


public class Test1
{
    public static void main(String [] s)
    {
        Patient A = new Patient();
        A.id = 1;
        A.age = 20;
        
        Patient B = new Patient(1, 20);
        Patient C = new Patient(3, 30);        
        
        System.out.println((A.equals(B)));
        System.out.println((A.equals(C)));
        System.out.println((B.equals(C)));
        
        
    }
    
}
