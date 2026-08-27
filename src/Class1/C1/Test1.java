/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 22, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Class1.C1;

public class Test1 
{
    public static void main(String [] s)
    {
        Car A = new Car();
        Car B = new Car();
        
        //modify public attributes
        A.model = "Lexus";
        A.year = 2025;
        
        B.model = "Ford";
        B.year = 2020;
        
        //accessing public attributes
        System.out.println(A.model);
        System.out.println(A.year);
                
        System.out.println(B.model);
        System.out.println(B.year);
                
                
    }
    
}
