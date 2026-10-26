/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 2, 2026
https://www.drbasit.org/cs102/

//Tester class 
*/
package Collection.C4;

import java.util.HashSet;

public class Test3
{
    public static void main(String [] args){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        set1.add(1);
        set1.add(3);
        set1.add(5);
        set1.add(6);
        set1.add(8);

        set2.add(1);
        set2.add(6);
        set2.add(7);
        set2.add(8);
        

        System.out.println(set1);
        System.out.println(set2);

        //Union -? addAll
        //set1.addAll(set2);

        //Intersection -? retainAll
        //set1.retainAll(set2);

        //Difference -? removeAll
        //set1.removeAll(set2);
        //set2.removeAll(set1);

        System.out.println(set1);        
        //System.out.println(set2);        
        
        
    }

    
}
