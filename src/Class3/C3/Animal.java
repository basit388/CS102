/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
September 15, 2026
https://www.ieeepsu.org/basit/cs102/

//abstract class Animal
*/
package Class3.C3;

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // Concrete method: Shared by all animals
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Abstract method: Must be implemented by subclasses
    public abstract void makeSound();
}
