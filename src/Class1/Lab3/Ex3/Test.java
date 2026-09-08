package Class1.Lab3.Ex3;

import java.util.Scanner;

/*
Exercise 3
Write a test program with these details
- Make a object r1 of type Robot using default constructor
- Set values for r1 
- Make a object r2 of type Robot using parameterized constructor
- Set values for r2
- Make a object r3
- Ask user to provide values for r3. try different values to validate input
- call toString method to display the values
- print count values for each object

*/
public class Test {
    public static void main(String [] s){
        Robot r1= new Robot();
        r1.setCharge(80);
        Robot r2=new Robot(99);
        Robot r3=new Robot(r1);
        
        Scanner In = new Scanner(System.in);
        System.out.println("Enter Charge: ");
        r3.setCharge(In.nextInt());
        
        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        System.out.println("r3: " + r3);
        
        System.out.println(Robot.count);
        
    }
}
