/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 22, 2026
https://www.ieeepsu.org/basit/cs102/

//Person class is used for teaching these concepts:
1. private members of class; setter and getter methods
2. overloaded constructors
3. copy constructors
*/
package Class1.C2;

public class Person 
{
    //variables / attributes
    public int ID; // <-----private member
    public String Name;
    
    //constuctors
    Person()
    {
        ID = 0;
        Name = "Human";
    }
    //overloaded constructor
    Person(int ID, String Name)
    {
        this.ID = ID;
        this.Name = Name;
    }
    //copy constructor
    Person(Person P)
    {
        if(P!=null)
        {
            this.ID = P.ID;
            this.Name = P.Name;
        }
    }
    
    //setters and getters needed for private members
    public int getID()
    {
        return ID;
    }
    public void setID(int ID)
    {
        this.ID = ID;
    }
}
