/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 22, 2026
https://www.ieeepsu.org/basit/cs102/

//Car and Engine classes are used for teaching these concepts:
1. toString() definition and usage
2. object composition
3. equals and instanceof
*/
package Class1.C4;

public class Car 
{
    //variables / attributes
    int year;
    String model;
    
    Engine e;
    
    //constructors
    Car(String m, int y)
    {
        year = y;
        model = m;
        e = new Engine();
    }
    Car(String m, int y, Engine engine)
    {
        year = y;
        model = m;
        e = new Engine(); //make new object e
        //deep copy engine
        if(engine!=null)
        {
            e.hp = engine.hp;
            e.type = engine.type;
        }
    }
    
    @Override
    public String toString()
    {
        return year + ", "+ model + ", " + e;
    }
      
}
