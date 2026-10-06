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

public class Test 
{
    public static void main(String [] args){
        Map<Integer, String> M = new HashMap<>();
        M.put(101, "Ali");
        M.put(102, "Ahmed");
        M.put(103, "Mohammad");
        M.put(104, "Ali");

        System.out.println(M);
        
        M.put(102, "John");
        System.out.println(M);

        M.remove(103);
        System.out.println(M);

        System.out.println(M.get(101));
        
        for (Map.Entry i : M.entrySet()) {
            int key = (int)i.getKey();
            String value = (String)i.getValue();
            System.out.println(key + " : " + value);
        }

    }

    
}
