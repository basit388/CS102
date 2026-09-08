/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
September 8, 2026
https://www.ieeepsu.org/basit/cs102/

//Character class is used for teaching these concepts:
1. extends, inheritance
*/
package Class2.C1;

public class Character {
    int health;
    String name;
    Character(){
        health=0;
        name="";
    }
    public void move(){
      System.out.println(name + " is moving");
    } 
    public void attack() { 
      System.out.println(name + " is attacking"); 
    }

}
