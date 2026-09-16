/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
September 15, 2026
https://www.ieeepsu.org/basit/cs102/

//Child class SmartPhone extends Phone
*/
package Class3.C2;

// Child Class
class SmartPhone extends Phone 
        implements Camera, GPS {
    
    private String model;

    public SmartPhone(String brand, String model) {
        super(brand);
        this.model = model;
    }

    @Override
    public void takePhoto() {
        // Accessing interface constants directly
        System.out.println(model + ": Taking photo in " + DEFAULT_MODE + 
                           " mode up to " + MAX_MEGAPIXELS + "MP.");
    }

    @Override
    public void getCoordinates() {
        // Accessing interface constants via interface name (recommended)
        System.out.println(model + ": Default location set to Lat: " + 
                           GPS.DEFAULT_LATITUDE + ", Long: " + GPS.DEFAULT_LONGITUDE);
    }
}
