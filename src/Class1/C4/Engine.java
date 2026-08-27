/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 22, 2026
https://www.ieeepsu.org/basit/cs102/

//Car and Engine classes are used for teaching these concepts:
1. toString() definition and usage
2. object composition
*/
package Class1.C4;

public class Engine 
{
    //variables / attributes
    int hp;
    String type;
    
    //constructors
    Engine(){
        type = "";
        hp = 0;
    }
    Engine(String type, int hp)
    {
        this.type = type;
        this.hp = hp;
    }
    
    public String toString()
    {
        return "[hp: " + hp + ", type: " + type +"]";
    }
}
