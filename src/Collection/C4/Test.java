/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 2, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Collection.C4;

import java.util.HashSet;

public class Test 
{
    public static void main(String [] args){
        HashSet<String> al = new HashSet<>();
        al.add("CS101");
        al.add("CS499");
        al.add("CS102");
        System.out.println(al);
        
        al.remove("CS499");
        System.out.println(al);
        
        System.out.println("is CS102 there? " +
                al.contains("CS102") );

    }

    
}
