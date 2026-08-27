/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 22, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Class1.C5;


public class Test
{
    public static void main(String [] s)
    {
        Patient A = new Patient();
        A.id = 1;
        A.age = 20;
        
        Patient B = new Patient(2, 18);
        
        //Lets check if A and B are equal!!
        if(A == B)
            System.out.println("true");
        else
            System.out.println("false");
        
        Patient C = new Patient(1, 20);
        
        //Lets check if A and C are equal!!        
        if(A == C)
            System.out.println("true");
        else
            System.out.println("false");
                
        //why false??
        //you cannot compare the object directly!!
        
    }
    
}
