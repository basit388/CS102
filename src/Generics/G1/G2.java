/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 20, 2026
https://www.drbasit.org/cs102/

Generics

*/
package Generics.G1;

 

public class G2 {
    
    public static <E> void printArr( E [] Arr){
        for(int i=0; i< Arr.length; i++)
        {
            System.out.print(Arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String [] s){
        
        Integer [] iArr = {1,2,3,4,5,6};
        Double [] dArr = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        String [] sArr ={"a", "b", "c", "d", "e", "f"};
        
        //printing arrays
        printArr(iArr);
        printArr(dArr);
        printArr(sArr);
        
        
        
        //find Max
        //find Min
        //find average
        
        
    }
}
