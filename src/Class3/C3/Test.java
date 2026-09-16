/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
September 15, 2026
https://www.ieeepsu.org/basit/cs102/

//Parent class Phone
*/
package Class3.C3;

public class Test {
    public static void main(String[] args) {
        Cat C = new Cat("Mittens");
        C.eat();         // Shared concrete method
        C.makeSound();   // Abstract method implementation

        System.out.println();

        Eagle E = new Eagle("Majestic");
        E.eat();       // Shared concrete method
        E.makeSound(); // Abstract method implementation
        E.fly();       // Interface method implementation
    }
}