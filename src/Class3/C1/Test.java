/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
September 15, 2026
https://www.ieeepsu.org/basit/cs102/

//Test abstract class
//Use polymorphism with abstract class
//Use @override abstract methods from inherited classes

*/
package Class3.C1;

public class Test {
    public static void main(String[] args) {

        Phone P1 = new Apple("iPhone 16 Pro", 256);
        Phone P2 = new Samsung("Galaxy S26", 512);

        //new object of abstract class is NOT allowed
        //Phone P3 = new Phone("Generic", 128);
        
        P1.displaySpecs(); // Shared method
        P1.powerOn();      // iPhone-specific behavior
        P1.takePhoto();

        System.out.println("---");

        P2.displaySpecs(); // Shared method
        P2.powerOn();      // Samsung-specific behavior
        P2.takePhoto();
    }
}