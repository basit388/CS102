/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 20, 2026
https://www.drbasit.org/cs102/

Using Generic Interface two types
*/
package Generics.G1;

interface Pair<K, V> {
    K getId();
    V getName();
}

class Student implements Pair<Integer, String> {
    public Integer getId() {
        return 101;
    }

    public String getName() {
        return "Ali";
    }
}

public class G10 {
    
    public static void main(String [] args){
        Pair<Integer, String> p = new Student();

        System.out.println(p.getId());   // 101
        System.out.println(p.getName()); // Ali    }

    }
}
