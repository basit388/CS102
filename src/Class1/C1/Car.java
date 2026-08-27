/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 22, 2026
https://www.ieeepsu.org/basit/cs102/

//Car class is used for teaching these concepts:
1. class attributes & methods
2. class constructors
3. class overloaded constructors
*/
package Class1.C1;

public class Car 
{
    //variables / attributes
    int year; // attribute
    String model;
    
    int getYear()
    {
        return year;
    }
    //constructors
    Car() // constructor
    {
        year = 2024;
        model = "Nil";
    }
    
    //overloaded constructor
    Car(int year, String m)// constructor with parameter
    {
        this.year = year;
        model = m;
    }

    //overloaded constructor
    Car(int year)
    {
        this.year = year;
    }
   
}
