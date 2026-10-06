/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 2, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Collection.C6;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Test1 
{
    public static void main(String [] args){
    
     	// Priority Queue Min Type
        PriorityQueue<Integer> p = new PriorityQueue<>();

        // Add elements to the queue
        p.add(3);
        p.add(10);
        p.add(7);
        p.add(2);

        Iterator<Integer> iterator = p.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}
