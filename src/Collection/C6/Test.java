/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 2, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Collection.C6;

import java.util.PriorityQueue;

public class Test 
{
    public static void main(String [] args){
    
     	// Priority Queue Min Type
        PriorityQueue<Integer> p = new PriorityQueue<>();

        // Add elements to the queue
        p.add(3);
        p.add(10);
        p.add(7);
        p.add(2);

        // peek() returns the head of the queue
        System.out.println("Head of Queue: " + p.peek());
        System.out.println(p);

        p.remove(10); // removes head of the queue
        System.out.println(p);
        
        
        //poll() removes the head of the queue
        p.poll();
        System.out.println(p);        

    }
}
