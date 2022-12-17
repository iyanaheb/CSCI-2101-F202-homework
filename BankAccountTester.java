public class BankAccountTester {
    public static void main(String[] args) {
        System.out.println("Welcome to the Bank Account Tester");
        // Example Bank Account used for Transfer Methods

        BankAccount gregChecking = new BankAccount(2000);
        BankAccount newChecking = new BankAccount(4000);
        
        // Tranfer
        gregChecking.withdraw(100);
        System.out.println(gregChecking.getBalance());
        newChecking.deposit(100);
        System.out.println(newChecking.getBalance());
  
        BankAccount.interact(gregChecking);
        

   }
} 