package Class1.Ex4;

/*
Exercise 4
Execute the following code.
*/

class A{
    private String privateVar = "Private Variable in ClassA";
    protected String protectedVar = "Protected Variable in ClassA";
    public String publicVar = "Public Variable in ClassA";
    
    private void privateMethod() {
        System.out.println("Private Method in ClassA");
    }
    protected void protectedMethod() {
        System.out.println("Protected Method in ClassA");
    }
    public void publicMethod() {
        System.out.println("Public Method in ClassA");
    }

    // Public method to demonstrate access within the same class
    public void accessPrivateInClassA() {
        System.out.println("Accessing private member in ClassA: " + privateVar);
        privateMethod(); // Accessing private method
    }
 
}

public class Test {
    
    public static void main(String[] args) {
        A objA = new A();

        // Access public variable and method (this will work fine)
        System.out.println("Accessing public member: " + objA.publicVar);
        objA.publicMethod();

        // Access protected variable and method (this will work fine as long as it's in the same package)
        System.out.println("Accessing protected member: " + objA.protectedVar);
        objA.protectedMethod();

        // Trying to access private variable (this will cause an error)
        // Uncommenting the following lines will result in a compilation error
        
        // System.out.println("Accessing private member: " + objA.privateVar); // ERROR
        // objA.privateMethod(); // ERROR

        // However, private members can be accessed within the same class through a public method
        System.out.println("\nAccessing private member through a public method:");
        objA.accessPrivateInClassA();
    }
}
    

