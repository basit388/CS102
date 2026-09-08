package Class1.Lab3.Ex1;
/*
Exercise 1
Write a class person with the following details:
-Add two attributes/variables private int age and private String name.
-Write two constructors with and without parameters
-Write setter and getter methods
-Write a toString() method that returns a string

*/
public class Person 
{
    private int age;
    private String name;
    
    Person(){
        age = 0;
        name = "";
    }
    Person(int A, String name){
        age = A;
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int a){
        age = a;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public String toString(){
        return "[" + name + ", " + age +"]";
    }
}
