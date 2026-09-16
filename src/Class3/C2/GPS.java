/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
September 15, 2026
https://www.ieeepsu.org/basit/cs102/

//interface GPS
*/
package Class3.C2;

interface GPS {

    // Interface variables are implicitly public, static, and final
    double DEFAULT_LATITUDE = 37.7749;
    double DEFAULT_LONGITUDE = -122.4194;

    void getCoordinates();
}
