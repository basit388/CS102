package Class3.Lab6.Ex2;

class Customer {
    private String name;
    private BankAccount account;

    public Customer(String name, BankAccount account) {
        this.name = name;
        this.account = account;
    }

    public void executeOperations() {
        System.out.println("--- Processing transactions for " + name + " ---");
        account.deposit(500);
        account.withdraw(200);

        // Check if customer's account is taxable using polymorphism
        if (account instanceof Taxable) {
            Taxable taxableAccount = (Taxable) account;
            taxableAccount.calculateTax();
        }
    }
}