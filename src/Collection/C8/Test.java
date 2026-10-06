/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 2, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Collection.C8;

import java.util.ArrayList;
import java.util.Collections;

public class Test 
{
    public static void main(String [] args){
    
        ArrayList<String> al = new ArrayList<>();

        al.add("Orange");
        al.add("Banana");
        al.add("Apple");

        Collections.sort(al); 
        System.out.println(al);
    }
}
