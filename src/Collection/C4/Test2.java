/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 2, 2026
https://www.drbasit.org/cs102/

//Tester class 
*/
package Collection.C4;

import java.util.LinkedHashSet;

public class Test2
{
    public static void main(String [] args){
        LinkedHashSet<String> al = new LinkedHashSet<>();
        al.add("CS101");
        al.add("CS499");
        al.add("CS102");

        System.out.println(al);

        al.remove("CS101");
        System.out.println(al);

        //Maintains order when adding values
        al.add("CS101");
        System.out.println(al);
        
        al.add("CS101");
        System.out.println(al);
                
    }

    
}
