/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
September 8, 2026
https://www.ieeepsu.org/basit/cs102/

*/   


package Class2.C2;

public class Archer extends Character{
    Archer(){
        this(0, "unknown");
        //note this() calls the constructor of the
        //same class. In this case it calls the
        //overloaded constructor.
    }
    Archer(int health, String name){
        super.health = health; //assign health to the super class.health
        super.name = name;//assign name to the super class.name
        //we can also use the super class 
        //constructor to initialize health and name
        //this should be called first:::
        //super(health,name);
    }

    @Override
    public void attack() { 
      //to call Character.attack() we use super
      super.attack();
      System.out.println(name + " is shooting a arrow");

    }

}
