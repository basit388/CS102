/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
September 8, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester for C1ass2.C1.Character
*/
package Class2.C1;

public class Test {

    public static void main(String [] args){
        
        Warrior w = new Warrior(); 
        w.name = "Thor"; 
        w.health = 100; 
        w.move(); 
        w.attack(); //inherited from Character
        w.useSword(); 
        
        Wizard z = new Wizard(); 
        z.name = "Gandalf";
        z.health = 80; 
        z.move(); 
        z.attack(); // inherited from Character
        z.fireBall(); 

    }

}
