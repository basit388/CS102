package Class1.Lab3.Ex2;
/*
Exercise 2
Write a class person with the following details:
-Add two attributes/variables private int age and private String name.
-Write two constructors with and without parameters
-Write a setter method that takes two parameters age and name.
-Write a getter method for age
-Write a getter method for name
-Write a toString() method that returns a string
-Write a method calculateBirthYear(); this returns the year the Person was born.


*/
public class Person 
{
    private int age;
    private String name;
    Person(){
        age = 0;
        name = "";
    }
    Person(int a, String n)
    {
        age = a;
        name = n;
    }
    public void setAgeName(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public String toString(){
        return "(" + name +", "+age+")";
    }
    public int calculateBirthYear()
    {
        return 2026-age;
    }
    
}
