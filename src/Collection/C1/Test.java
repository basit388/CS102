/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 2, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Collection.C1;

import java.util.ArrayList;
import java.util.Collection;

public class Test 
{
    public static void main(String [] s)
    {
        Collection <String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println(fruits.remove("BananA"));
        System.out.println(fruits);

      
    }
    
}
