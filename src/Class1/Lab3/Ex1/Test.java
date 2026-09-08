package Class1.Lab3.Ex1;

/*
Exercise 1
Write a test program with these details
- Make a object P1 of type Person using default constructor
- Set values for P1 
- Make a object P2 of type Person using parameterized constructor
- Set values for P2
- call toString method to display the values
*/
public class Test {
    public static void main(String [] args)
    {
        Person p1 = new Person();
        p1.setAge(19);
        p1.setName("Ahmed");
        
        Person p2 = new Person(20, "Mohammad");
        
        System.out.println(p1.toString());
        System.out.println(p2);
        
    }
    
}
