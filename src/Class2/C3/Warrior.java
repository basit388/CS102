/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
September 8, 2026
https://www.ieeepsu.org/basit/cs102/

*/
package Class2.C3;

public class Warrior extends Character{
    int kills;
    Warrior(){
        super(); //call the constructor of Character class
                 //super() must be the first line in constructor
        kills =0;                 
    }
    Warrior(int health, String name){
        super(health, name);
        //note: health and name are members of the
        //parent class. super() calls the constructor
        //of the parent class.
        kills =0;
    }

    @Override
    public void attack() { 
      //to call Character.attack() we use super
      super.attack();
      System.out.println(name + " is attacking with a sword");
      kills++;
      super.health--;
    }
    @Override
    public String toString(){
        return super.name +" with health " +
               super.health + " has kills: "+
               kills;
    }

}
