/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 2, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Collection.C7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test4 
{
    public static void main(String [] args){
    
        List<String> L = new ArrayList<>();
        L.add("My"); 
        L.add("name"); 
        L.add("is"); 
        L.add("Ahmad"); 

        ListIterator<String> I = L.listIterator();

        //forward iterator
        while (I.hasNext()) {
            System.out.println(I.next());
        }
        
        //backward iterator
        while(I.hasPrevious()){
            System.out.println(I.previous());
        }
    }
}
