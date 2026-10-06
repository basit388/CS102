/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 2, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Collection.C2;

import java.util.ArrayList;
import java.util.List;

public class Test1 
{
    public static void main(String [] s)
    {
        List<String> al = new ArrayList<>();
        al.add("Cat");    
        al.add("Dog");     
        al.add("Horse");    
        al.add("Cow");    

        System.out.println("Before:" + al);
        
        al.remove("Horse");
        System.out.println("After:" + al);

        System.out.println("value at position 1:" + al.get(1) );

        System.out.println("is Cat there?" + al.contains("Cat") );

        for(int i=0;i<al.size();i++)
            System.out.println("position "+i+": "+ al.get(i) );

    }
    
}
