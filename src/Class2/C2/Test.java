/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
September 8, 2026
https://www.ieeepsu.org/basit/cs102/

//Character class is used for teaching these concepts:
1. extends, inheritance
2. use super constructor
3. use super to call parent class methods
4. 
*/
package Class2.C2;

public class Test {

    public static void main(String [] args){
        
        Warrior w1 = new Warrior();
        //note this calls the super constructor
        //of the Character class
        
        w1.name = "Thor"; 
        w1.health = 100; 
        w1.attack(); //inherited from Character
                     //because of override, calls:
                     //Warrior.attack();
        
        Warrior w2 = new Warrior(10,"Saladin");
        //note this calls the super constructor
        //of the Character class
        w2.attack();
      
        Archer a1 = new Archer(50, "Legolas");
        a1.attack();
        
        Archer a2 = new Archer();
        a2.attack();
        
    }

}
