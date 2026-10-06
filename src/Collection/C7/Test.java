/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 2, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Collection.C7;

import java.util.Arrays;

public class Test 
{
    public static void main(String [] args){
    
        Iterable<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
