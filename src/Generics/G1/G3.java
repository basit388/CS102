/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 20, 2026
https://www.drbasit.org/cs102/

Generics

*/
package Generics.G1;

class Item <T>{
    private T value;

    T get(){
        return value;
    }
    void set(T value){
        this.value = value;
    }
}
 

public class G3 {
    
    public static void main(String [] args){
        
        Item <Integer> i = new Item<>();
        i.set(3);
        System.out.println(i.get());
        
        Item <String> s = new Item<>();
        s.set("hello");
        System.out.println(s.get());
        
    }
}
