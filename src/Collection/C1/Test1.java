/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 2, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Collection.C1;

import java.util.ArrayList;
import java.util.Collection;

public class Test1 
{
    public static void main(String [] s)
    {
        Collection <Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(4);
        nums.add(1);

        nums.remove(4);
        System.out.println(nums);

    }
    
}
