/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
September 8, 2026
https://www.ieeepsu.org/basit/cs102/

*/
package Class2.C2;

public class Warrior extends Character{
    Warrior(){
        super(); //call the constructor of Character class
                 //super() must be the first line in constructor
    }
    Warrior(int health, String name){
        super(health, name);
        //note: health and name are members of the
        //parent class. super() calls the constructor
        //of the parent class.
    }

    @Override
    public void attack() { 
      //to call Character.attack() we use super
      super.attack();
      System.out.println(name + " is attacking with a sword");

    }

}
