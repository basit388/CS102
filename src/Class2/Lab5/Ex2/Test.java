/*
Instructions:
Observe the main method created to test. It has errors, fix it!!

Change the code to add two new object (Phones) of your choice.
Modify the program to print information for each phone
*/
package Class2.Lab5.Ex2;


public class Test {
    public static void main(String [] s){
        Phone p1 = new Apple("iPhone 15 Pro", 999.00, "iOS 17");
        Phone p2 = new Samsung("Galaxy S24 Ultra", 1299.00, "One UI 6.1")

        System.out.println("=== Testing Dynamic Method Dispatch ===\n");

        System.out.println(
            "Device: " + p1.getModel() +
            " | Price: $" + p1.getPrice());

        // Polymorphic calls 
        p1.powerOn();

        System.out.println("----------------------------------------");
    
    
    
    
    }
}
