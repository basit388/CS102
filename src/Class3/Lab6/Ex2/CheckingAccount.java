/*
Instructions:
1. Create class CheckingAccount extended from BankAccount
2. Variables:
     private double overDraftLimit
3. Methods
  Constructor with three parameters; 
    calls super constructor
    initialize overDraftLimit
  override method withdraw() takes double amount as parameter
    print "Withdrawing money from checking account:" account
    if amount>0 and balance >amount then
        subtract amount from balance
        return true otherwise display error msg and return false
*/
package Class3.Lab6.Ex2;


