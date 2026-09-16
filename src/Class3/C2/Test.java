/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
September 15, 2026
https://www.ieeepsu.org/basit/cs102/

//Test class
//
*/
package Class3.C2;

public class Test {
    public static void main(String[] args) {
        SmartPhone myPhone = 
                new SmartPhone("Samsung", "Galaxy S25");

        myPhone.makeCall("555-0199");
        myPhone.takePhoto();
        myPhone.getCoordinates();

        // Accessing interface variables directly without an instance
        System.out.println("\nCamera Max Megapixels Constant: "
                + Camera.MAX_MEGAPIXELS);

        // Accessing interface variables directly without an instance
        System.out.println("GPS Coordinates: "
                + GPS.DEFAULT_LATITUDE + ", "
                +GPS.DEFAULT_LONGITUDE);
        
        //Using polymorphism
        Phone P = new SmartPhone("Apple", "iPhone 17 Pro");
        P.makeCall("555-1111");
        
        //why is the following NOT allowed?

        //P.takePhoto();
        //P.getCoordinates();
        
        
    }
}
