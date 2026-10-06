/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
September 15, 2026
https://www.ieeepsu.org/basit/cs102/

// Subclass inheriting from Animal and implementing Flyable
*/
package Class3.C3;

class Eagle extends Animal
        implements Flyable {
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + 
                " screams: Screech!");
    }

    @Override
    public void fly() {
        System.out.println(name + 
                " is soaring high in the sky.");
    }
}