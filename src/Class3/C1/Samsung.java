/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
September 15, 2026
https://www.ieeepsu.org/basit/cs102/

//create Samsung inherited class from Phone
//Give definition for super.abstract methods
*/
package Class3.C1;

// Subclass for Phone
class Samsung extends Phone {
    public Samsung(String model, double storageGB) {
        super(model, storageGB);
    }

    @Override
    void powerOn() {
        System.out.println(getModel() + 
                ": Displays Samsung Knox screen and boots Android");
    }

    @Override
    void takePhoto() {
        System.out.println(getModel() + 
                ": Processing photo using Expert RAW engine.");
    }
}