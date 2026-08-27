/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 22, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Class1.C1;

public class Test 
{
    public static void main(String [] s)
    {
        Car A = new Car();
        System.out.println(A);
        
        //accessing public attributes
        System.out.println(A.model);
        System.out.println(A.year);
        
        //modify public attributes
        A.model = "Lexus";
        A.year = 2025;
        
        //accessing public attributes
        System.out.println(A.model);
        System.out.println(A.year);
                
        
        
        
    }
    
}
