/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
September 15, 2026
https://www.ieeepsu.org/basit/cs102/

//Parent class Phone
*/
package Class3.C2;

// Parent Class
class Phone {
    private String brand;

    public Phone(String brand) {
        this.brand = brand;
    }

    public void makeCall(String number) {
        System.out.println("Calling " + number + 
                " from " + brand + " phone...");
    }
}
