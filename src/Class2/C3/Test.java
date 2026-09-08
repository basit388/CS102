/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
September 8, 2026
https://www.ieeepsu.org/basit/cs102/

//Character class is used for teaching these concepts:
1. polymorphism

*/
package Class2.C3;

public class Test {

    public static void main(String [] args){
        //Warrior is inherited from Character;
        //We can "stored" Warrior object in Character object
        //This is Polymorphism
        Character c1 = new Warrior(100, "Aragon");
        
        Character c2 = new Archer(50, "Legolas");
        
        c1.attack();
        //Note Character class has NO toString() method
        System.out.println(c1.toString());
        
        c2.attack();
        System.out.println(c2);
        
        //We can create an array of Characters
        Character [] Players = {
                new Warrior(100, "Gimli"),
                new Warrior(45, "Boromir"),
                new Archer(77,"Frodo"),
                new Archer(65, "Sam"),
                new Warrior(1, "Nazgul")
        };
        
        //Do random runs
        for(int i=0;i<10;i++){
           int Random = (int)(Math.random()* 5);
           Players[Random].attack();

        }
        System.out.println("----------------State----------------");
        for(int i=0;i<Players.length;i++)
        {
            System.out.println(Players[i].toString());
        }
        
        
    }

}
