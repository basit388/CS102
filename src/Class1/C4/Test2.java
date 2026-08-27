/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 22, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Class1.C4;

public class Test2 
{
    public static void main(String [] s)
    {
        Car A = new Car("Toyota", 2022);
        
        System.out.println(A);
        
        Engine a = new Engine("petrol", 200);
        A.e = a;
        
        System.out.println(A);
        
        //use cascade to access variables.
        
        A.e.hp = 215; // Car A has-a engine a; change a.hp to 215

        A.e.type = "hi-octane petrol"; // Car A has-a engine a; change a.type
        System.out.println(A);
        
        

    }
    
}
