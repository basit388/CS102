/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 2, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Collection.C3;

import java.util.LinkedList;

public class Test 
{
    public static void main(String [] s)
    {
        LinkedList<Integer> al = new LinkedList<>();
        al.add(1);    
        al.add(2);     
        al.add(3);    
        al.add(2);

        System.out.println("Before:" + al);
        
        al.remove(2);
        System.out.println("After:" + al);


    }
    
}
