/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 22, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Class1.C1;

public class Test3 
{
    public static void main(String [] s)
    {
        Car A = new Car();
        System.out.println(A);     
                
        Car B = new Car();
        B.year = 2000;
        System.out.println(B.model);
        System.out.println(B.year);
        
        Car C = new Car(2013, "CX 9");
        System.out.println(C.model);
        System.out.println(C.year);
        
        Car D = new Car(1970);
        
   
    }
    
}
