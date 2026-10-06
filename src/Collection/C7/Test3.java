/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 2, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Collection.C7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test3 
{
    public static void main(String [] args){
    
        Map <Integer, String> m = new HashMap <>();
        m.put(101, "IPhone");
        m.put(102, "Samsung");
        m.put(103, "Honor");  
        
        //Iterator<String> I = m.iterator(); // ERROR

        Iterator<Integer> keys = m.keySet().iterator();

        while (keys.hasNext()) {
            System.out.println(keys.next());
        } 
        
        Iterator<String> v = m.values().iterator();

        while (v.hasNext()) {
            System.out.println(v.next());
        }         
        
        

    }
}