/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 2, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Collection.C8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test5 
{
    public static void main(String [] args){
    
        Integer [] A = {2,6,7,1,5,9,3};
        
        List<Integer> N = Arrays.asList(A);
        
        System.out.println(N);
        
        Collections.sort(N);
        
        System.out.println(N);
        
        System.out.println("Smallest: "+ 
                Collections.min(N));
        System.out.println("Largest: "+ 
                Collections.max(N));
        
        
        System.out.println("Searching 3: "+ 
                Collections.binarySearch(N, 3));
        
        //binary search sorts then returns the position
        
    }
}
