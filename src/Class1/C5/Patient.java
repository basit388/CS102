/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 22, 2026
https://www.ieeepsu.org/basit/cs102/

//Patient class is used for teaching these concepts:
1. equals and instanceof
*/
package Class1.C5;

public class Patient 
{
    //variables / attributes
    int id;
    int age;
    
    //constructors
    Patient()
    {
        id = 0;
        age = 0;
    }
    Patient(int i, int a)
    {
        id = i;
        age = a;
    }

    @Override
    public String toString()
    {
        return id + ", "+ age;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Patient) 
        {
            Patient other = (Patient) o;
            return id==other.id && age == other.age;
        } 
        else 
            return false;
        
    }
      
}
