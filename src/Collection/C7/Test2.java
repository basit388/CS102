/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 2, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Collection.C7;

import java.util.HashSet;
import java.util.Iterator;

public class Test2 
{
    public static void main(String [] args){
    
        HashSet <String> h = new HashSet <>();
        h.add("IPhone");
        h.add("Samsung");
        h.add("Honor");  
        
        Iterator<String> I = h.iterator();
        
        while (I.hasNext()) {
            System.out.println(I.next());
        }        

    }
}
