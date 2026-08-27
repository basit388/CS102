/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 22, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Class1.C4;

public class Test
{
    public static void main(String [] s)
    {
        Car A = new Car("Toyota", 2022);
        
        System.out.println(A.model + ", " + A.year);
        
        //a better approach: call toString()
        
        System.out.println(A.toString());
        
        //or
        
        System.out.println(A);
        //note object A.toString() is overridden (We study later)
        
        
                
                
    }
    
}
