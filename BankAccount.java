import java.util.Scanner;

/*
 * This is a Java Doc
 * This is a multi-line comment
 *  
 * Our BankAccount class will represent a bank account
 * It will have a balance and a name
 * It will have methods to deposit and withdraw money
 * It will have a method to print the balance
 * it will have a menu that the user can interact with
 * 
 * 
 */

public class BankAccount {
  private double balance;
    private String name;
    private double interestRate = 0.01;
    private int period = 4; // quarterly


    // Constructor
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public BankAccount(String name) {
        this.name = name;
        this.balance = 0;
    }
    public BankAccount(double balance){
        this.balance = balance;
        this.name = "No Name";
    }
    // Default Constructor
    // Make a BankAccount without Specifying any parameters
    public BankAccount(){
        this.balance = 0;
        this.name = "No Name";
    }

    // Create getters and setters for balance
    public double getBalance() {
        return balance;
    }

    // Create a method for printing the balance as a String
    public String printBalance() {
        return "Your Balance is: $" + balance;
    }

    // public void setBalance(double balance) {
    //     this.balance = balance;
    // }
    // Set balance is flawed in that we would never
    // be able to actually set the balance. Instead we need 
    // to create methods to deposit and withdraw money

    // Create getters and setters for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    

    // Create a method to deposit money
    public void deposit(double amount) {
        this.balance += amount;
        // above is the same as this.balance = this.balance + amount;
        // balance is 10,000
        // amount  is 2,000
        // balance = balance + amount
        // 10000 = 10000 + 2000

// the addition of the savings account method

if (balance >= 10000) {
    // Prompt the user to confirm if they want to create a savings account
    System.out.print("You have a balance of $" + balance + " and are eligible to create a savings account. Do you want to create a savings account? (Y/N)");
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    if (input.equalsIgnoreCase("Y")) {
        // Prompt the user to choose between compound and flat rate interest
        System.out.print("Do you want a savings account with compound interest or flat rate interest? (C/F)");
        input = scan.nextLine();
        if (input.equalsIgnoreCase("C")) {
            // Prompt the user for the principal and number of years for the compound interest savings account
            System.out.print("Enter the principal: ");
            double principal = scan.nextDouble();
            System.out.print("Enter the number of years: ");
            int years = scan.nextInt();
            double apy = 0.0001; // Set the APY for the compound interest account
            double interest = principal * Math.pow((1 + apy), years); // Calculate the total interest earned
            System.out.println("Your savings account with compound interest has an interest of $" + interest + " after " + years + " years.");
        } else if (input.equalsIgnoreCase("F")) {
            // Prompt the user for the principal and number of years for the flat rate interest savings account
            System.out.print("Enter the principal: ");
            double principal = scan.nextDouble();
            System.out.print("Enter the number of years: ");
            int years = scan.nextInt();
            double apy = 0.001; // Set the APY for the flat rate interest account
            double interest = principal * apy * years; // Calculate the total interest earned
            System.out.println("Your savings account with flat rate interest has an interest of $" + interest + " after " + years + " years.");
        } else {
            System.out.println("Invalid input. Savings account not created.");
        }
    } else {
        System.out.println("Savings account not created.");
    }
} else {
    System.out.println("You do not have a sufficient balance to create a savings account.");
}

    }

    // Create a method to withdraw money
    public void withdraw(double amount) {
        this.balance -= amount;
// the addition of the overdraft method is added here.
        if (balance - amount < 0) {
           
            System.out.print("You do not have sufficient funds. Withdrawing this amount will result in an overdraft fee. Do you want to continue? (Y/N)");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("Y")) {
                balance -= amount + 35; // Charge the overdraft fee
            } else {
                System.out.println("Withdrawal cancelled.");
            }
        } else {
            balance -= amount;
        }
        // above is the same as this.balance = this.balance - amount;
        // balance is 10,000
        // amount  is 2,000
        // balance = balance - amount
        // 10000 = 10000 - 2000
    }
    public static void transfer(BankAccount from, BankAccount to, double amount,double fee)
    {
        from.withdraw(amount);
        to.deposit(amount);
    }
    // Create a method that will subtract a monthly fee from the balance
    // This method will take a double as an argument
    // This method will subtract the fee from the balance
    public void monthlyFee(double fee) {
        withdraw(fee);
    }


    // Create a method that will calculate the interest on the balance using compound interest
    // P(1 + R/n)^(nt) - P 
    // P = Principal
    // R = Rate
    // n = number of times interest is compounded per year (annum)
    // t = number of years
    // This method will take a double as an argument
    // This method will return a double

    // P can be this.balance or getBalance() if you would like to use a getter


    public void calcInterest(double principal, int time, double rate, int annum){
        double amount = principal * Math.pow(1+ (rate/annum), annum*time);
        double roundedamount = Math.round(amount * 100.0) / 100.0;
        double compinterest = amount - principal;
        compinterest = Math.round(compinterest * 100.0) / 100.0;
        System.out.println("Current Rate is: "+rate+"%");
        System.out.println("Current Period is: "+annum+" times per year");
        System.out.println("Selected Time is: "+time+" years");
        System.out.println("Compound Interest after " + time + " years: $" + compinterest);
        System.out.println("Amount after " + time + " years: $" + roundedamount);
    }

    public void  calculateSimpleInterest(double principal, double time, double rate) {
        double simpleint=(principal * rate * time) / 100;
        System.out.println("Current Rate is: "+rate+"%");
        System.out.println("Selected Time is: "+time+" years");
        System.out.println("Your simple interest after "+time+ "  years is "+simpleint);
    }



    // Create a method that will print a menu to the user
    // this is called a helper method
    public static int menu(){
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Bank Account Menu");
        System.out.println("--------------------------------");
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Print Balance");
        System.out.println("4. Calculate Interest");
        System.out.println("5. Calculate simple Interest");
        System.out.println("0. Exit");
        System.out.println("Please enter your choice: ");
        choice = input.nextInt();
        return choice;
    }
    // Create a method that will interact with the user based on their choice from the menu
    // This method will take a BankAccount object as an argument
    public static void interact(BankAccount account){
        // get the choice from the menu
        int choice = menu();
        // create a scanner object
        Scanner input = new Scanner(System.in);
        // use that choice and run the method associated with that choice
        // in class we learned about recursion and how to use it
        // we will use recursion to keep the menu running until the user chooses to exit
        // This is outside of the scope of this class but it is worth knowing about

        if (choice == 1) {
            System.out.println("How much would you like to deposit?");
            double amount = input.nextDouble();
            account.deposit(amount);
            System.out.println(account.printBalance());
            // interact(account);
        } else if (choice == 2) {
            System.out.println("How much would you like to withdraw?");
            double amount = input.nextDouble();
            account.withdraw(amount);
            System.out.println(account.printBalance());
            // interact(account);
        } else if (choice == 3) {
            System.out.println(account.printBalance());
            // interact(account);
        } else if (choice == 4) {
            System.out.println("What is the time in years to invest (Whole Numbers Only)?");
            int time = input.nextInt();
            // double principal, int time, double rate, int period
            account.calcInterest(account.getBalance(), time, account.interestRate, account.period);

            System.out.println("... Thank you for using the Bank Account Menu. Have a nice day! ...");

            
         } else if (choice == 5) {
                System.out.println("What is the time in years to invest (Whole Numbers Only)?");
                int time = input.nextInt();
                // double principal, int time, double rate, int period
                account.calculateSimpleInterest(account.getBalance(), time, account.interestRate);
    
                System.out.println("... Thank you for using the Bank Account Menu. Have a nice day! ...");           
        }else if (choice == 0) {
            System.out.println("Thank you for using the Bank Account Menu");
        } else { // this would catch 69420
            System.out.println("Invalid Choice");
            // interact(account);
        }

// the savings account method

    
}
}