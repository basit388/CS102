/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 22, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Class1.C4;

public class Test1 
{
    public static void main(String [] s)
    {
        Car A = new Car("Toyota", 2022);
        
        System.out.println(A);
        
        //Make a object a of type Engine
        Engine E = new Engine("petrol", 200);
        
        //Point A.engine e to the new Engine object a
        A.e = E;
        
        System.out.println(A);
        
/*
    Exercise: Use debugger to check the address of
              Car object A
              Engine object E
              A.e which points to E
              A.e and E have the same address;
*/
        
    }
    
}
