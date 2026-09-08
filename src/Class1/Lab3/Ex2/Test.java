package Class1.Lab3.Ex2;

import java.util.Scanner;

/*
Exercise 2
Write a test program with these details
- Make a object P1 of type Person using default constructor
- Set values for P1 
- Make a object P2 of type Person using parameterized constructor
- Set values for P2
- Make a object P3
- Ask user to provide values for P3
- call toString method to display the values
- call calculateBirthYear() to find the birth year for all objects

*/
public class Test {
   public static void main(String []s)
   {
       Person p1 = new Person();
       p1.setAgeName(23, "Ali"); 
       
       Person p2 = new Person(16, "Saleh");
       Person p3 = new Person();
       
       Scanner In = new Scanner(System.in);
       System.out.println("Enter Name: ");
       String n = In.next();
       
       System.out.println("Enter age: ");
       int a = In.nextInt();
       
       p3.setAgeName(a, n);
       System.out.println(p3.toString());
       
       System.out.println("p1: " + p1.calculateBirthYear());
       System.out.println("p2: " + p2.calculateBirthYear());
       System.out.println("p3: " + p3.calculateBirthYear());
             
   }
}
