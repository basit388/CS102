/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
September 8, 2026
https://www.ieeepsu.org/basit/cs102/

//Character class is used for teaching these concepts:
1. extends, inheritance
2. user super constructor
3. user super to call parent class methods
*/
package Class2.C2;

public class Character {
    int health;
    String name;
    Character(){
        health=0;
        name="unknown";
    }
    Character(int h, String n){
        health=h;
        name=n;
    }

    public void attack() { 
      System.out.println(name + " attacks"); 
    }

}
