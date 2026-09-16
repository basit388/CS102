/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
September 15, 2026
https://www.ieeepsu.org/basit/cs102/

//Phone class is used for teaching these concepts:
1. abstract classes
2. abstract methods

*/
package Class3.C1;

abstract class Phone {
    private String model;
    private double storageGB;

    public Phone(String model, double storageGB) {
        this.model = model;
        this.storageGB = storageGB;
    }

    // Abstract methods: 
    //Every phone does these, but differently
    abstract void powerOn();
    abstract void takePhoto();

    // Concrete method: 
    //Identical logic shared across all phones
    public void displaySpecs() {
        System.out.println("Model: " + model + 
                " | Storage: " + storageGB + "GB");
    }

    public String getModel() {
        return model;
    }
}
