/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
September 15, 2026
https://www.ieeepsu.org/basit/cs102/

//interface Camera
*/
package Class3.C2;

interface Camera {

    // Interface variables are implicitly public, static, and final
    int MAX_MEGAPIXELS = 108; 
    String DEFAULT_MODE = "AUTO";
    
    void takePhoto();
}
