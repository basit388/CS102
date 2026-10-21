/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 20, 2026
https://www.drbasit.org/cs102/

Using Generic Interface

*/
package Generics.G1;

interface Box<T> {
    void set(T value);
    T get();
}

class IntegerBox implements Box<Integer> {
    private Integer value;

    public void set(Integer value) {
        this.value = value;
    }

    public Integer get() {
        return value;
    }
}

class StringBox implements Box<String> {
    private String value;

    public void set(String value) {
        this.value = value;
    }

    public String get() {
        return value;
    }
}


public class G8 {
    
    
    public static void main(String [] args){
        Box<Integer> b1 = new IntegerBox();
        b1.set(50);
        System.out.println(b1.get()); // 100

        Box<String> b2 = new StringBox();
        b2.set("Java");
        System.out.println(b2.get()); // Hello
    }
}
