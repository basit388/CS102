/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 20, 2026
https://www.drbasit.org/cs102/

Generics

*/
package Generics.G1;

public class G1 {
    public static void main(String [] s){
        
        Integer [] iArr = {1,2,3,4,5,6};
        Double [] dArr = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        String [] sArr ={"a", "b", "c", "d", "e", "f"};
        
        //printing arrays
        for(int i=0; i< iArr.length; i++)
        {
            System.out.print(iArr[i] +" ");
        }
        System.out.println();

        for(int i=0; i< dArr.length; i++)
        {
            System.out.print(dArr[i] +" ");
        }
        System.out.println();

        for(int i=0; i< sArr.length; i++)
        {
            System.out.print(sArr[i] +" ");
        }
        System.out.println(); 
        
        //find Max
        //find Min
        //find average
        
        
    }
}
