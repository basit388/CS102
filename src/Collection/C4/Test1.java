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
import java.util.Iterator;

public class Test1
{
    public static void main(String [] args){
        HashSet<String> al = new HashSet<>();
        al.add("CS101");
        al.add("CS499");
        al.add("CS102");

        Iterator<String> iterator = al.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + ", ");

        
    }

    
}
