
package Class3.Lab6.Ex2;

public class Test {
    public static void main(String[] args) {
        // Customer 1 with a Checking Account
        BankAccount checking = new CheckingAccount("CHK-1001", 1000.0, 500.0);
        Customer customer1 = new Customer("Alice", checking);
        customer1.executeOperations();

        System.out.println();

        // Customer 2 with a Savings Account
        BankAccount savings = new SavingsAccount("SAV-2002", 5000.0, 0.04);
        Customer customer2 = new Customer("Bob", savings);
        customer2.executeOperations();
    }
}
