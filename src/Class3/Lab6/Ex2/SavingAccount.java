/*
Instructions:
1. Create class SavingAccount extended from BankAccount
    implements Taxable
2. Variables:
     private double interestRate
3. Methods
  Constructor with three parameters; 
    calls super constructor
    initialize interestRate
  override method withdraw() takes double amount as parameter
    print "Withdrawing money from saving account:" account
    if amount>0 and balance >amount then
        subtract amount from balance
        return true otherwise display error msg and return false
  override method calculateTax() 
    compute-> double interestEarned = balance * interestRate;
    compute-> double tax = interestEarned * TaxRate
    print "Tax on saving account:" tax
    return tax
*/
package Class3.Lab6.Ex2;


