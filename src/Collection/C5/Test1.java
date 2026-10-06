/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 2, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Collection.C5;

import java.util.HashMap;
import java.util.Map;

public class Test1 
{
    public static void main(String [] args){
        Map<Integer, String> M = new HashMap<>();
        M.put(101, "Ali");
        M.put(102, "Ahmed");
        M.put(103, "Mohammad");
        M.put(104, "Ali");

        System.out.println(M.containsKey(102));
        System.out.println(M.containsValue("Ali"));
        
        System.out.println(M.keySet());
        
        System.out.println(M.values());
        
        System.out.println(M.size());

    }

    
}
