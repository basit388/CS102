/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 20, 2026
https://www.drbasit.org/cs102/

Using Generic Interface with Generic class

*/
package Generics.G1;

interface Box<T> {
    void set(T value);
    T get();
}

class GenericBox<T> implements Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}


public class G9 {
    
    
    public static void main(String [] args){
        Box<Integer> b1 = new GenericBox<>();
        b1.set(50);

        Box<String> b2 = new GenericBox<>();
        b2.set("Java");

        System.out.println(b1.get()); // 50
        System.out.println(b2.get()); // Java
    }
}
