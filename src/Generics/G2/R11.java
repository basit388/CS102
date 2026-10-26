/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 20, 2026
https://www.drbasit.org/cs102/

Fibonacci numbers.... 
Warning: This program runs slow for large values!
*/
package Generics.G2;

public class R11 {
    public static void main(String [] args){
        
        System.out.println(fib(10));
    }
    
    public static int fib(int i){
        if(i==0)
            return 0;
        else if (i == 1)
            return 1;
        else
            return fib(i-1) + fib(i-2);
    }
}
