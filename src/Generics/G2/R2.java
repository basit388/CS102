/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 20, 2026
https://www.drbasit.org/cs102/

A Recursive program
*/
package Generics.G2;

public class R2 {
    public static void main(String [] args){
        
        printNum(5);
        
    }
    
    public static void printNum(int i){
        if(i==0) // base case; reason to stop looping
            return;
        else // recursive case; continue looping
        {
            System.out.println(i);
            printNum(i-1); //a method calls itself
        }
        
    }
    
    
    
}
