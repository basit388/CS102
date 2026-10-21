/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 20, 2026
https://www.drbasit.org/cs102/

Generics using type extends
<T extends Comparable>: Comparable method

*/
package Generics.G1;



public class G6 {
    
    public static <T extends Comparable<T>> T max(T a, T b) {
        if (a.compareTo(b) > 0)
            return a;
        else
            return b;
    }
    
    public static void main(String [] args){
        System.out.println(max(2,5));
        System.out.println(max('a','f'));
        System.out.println(max("hi","hoax"));
        
        
    }
}
