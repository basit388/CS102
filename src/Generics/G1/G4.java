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
    Item(){

    }
    Item(T v){
        value = v;
    }
    T get(){
        return value;
    }
    void set(T value){
        this.value = value;
    }
}
 

public class G4 {
    
    public static void main(String [] args){
        
        Item <Double> d = new Item<>(3.0);
        System.out.println(d.get());
        
        Item <String> s = new Item<>("abc");
        System.out.println(s.get());
    }
}
