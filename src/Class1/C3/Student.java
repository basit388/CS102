/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 22, 2026
https://www.ieeepsu.org/basit/cs102/

//Student class is used for teaching these concepts:
1. static variables
2. static methods
3. final keyword
*/
package Class1.C3;

public class Student 
{
    private String name;
    private int id;
    
    static int count = 0; // <-- static is shared by the class
    
    final int MAX_STUDENTS = 25; // <-- final cannot be changed
    
    Student()
    {
        count++; 
    }
    Student(int id, String name) {
        this.name = name;
        this.id = id;

        count++;
    }  
    
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String s)
    {
        this.name = s;
    }    
    
    //static method
    public static void changeStudentCount(int c)
    {
        count = c; //<-- count is static
    }
}
