/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 2, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Collection.C1;

import java.util.ArrayList;
import java.util.Collection;

class Car{
    String name;
    int doors;
    Car(String n, int d){
        this.name = n;
        this.doors = d;
    }
    
    @Override
    public String toString(){
        return "{"+name+", "+doors +"}";
    }
}

public class Test2 
{
    public static void main(String [] s)
    {
        Collection <Car> c = new ArrayList<>();
        c.add(new Car("Toyota", 4));
        c.add(new Car("Lexus", 4));
        c.add(new Car("Ford", 2));


        System.out.println(c);

    }
    
}
