
/* public class BankAccount {

     private float balance;
     private String number;
     private String owner;
     private String name;

     public float getBalance() {
         return balance;
     }

     public void setBalance(float balance) {
         this.balance = balance;
     }

     public String getOwner() {
         return owner;
     }

     public void setOwner(String Owner) {
         this.owner = owner;
     }


     public void deposit(float amt) {
         this.balance += amt;
     }


     public BankAccount(float balance, String number, String owner, String name) {
         this.balance = balance;
         this.number = number;
         this.owner = owner;
         this.name = name;
     }

     @Override
     public String toString() {
         return "BankAccount{" +
                 "balance=" + balance +
                 ", number=" + number +
                 ", owner='" + owner + '\'' +
                 ", name='" + name + '\'' +
                 '}';
     }

     public static void main(String[] args) {
         BankAccount personal = new BankAccount(0.00f, "000001", "Sandup", "personal");
         BankAccount family = new BankAccount(0.00f, "0000002", "Sandup Lama", "family");
         BankAccount business = new BankAccount(0.00f, "0000003", "Sandup Lama", "business");

         System.out.println(personal.toString());
         System.out.println(family.toString());
         System.out.println(business.toString());

         personal.deposit(500.00f);
         business.deposit(1450000.00f);
         family.deposit(4562560.23f);

         System.out.println("the larger account is the " + ((business.balance > personal.balance) ? business.name : personal.name));


     }
 }*/


public class BankAccount {
    private String name;
    private float balance;
    private String accountNumber;
    private BankAccount overdraftProtection;

    //	here are my getters and setters
    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccount getOverdraftProtection() {
        return overdraftProtection;
    }

    public void setOverdraftProtection(BankAccount overdraftProtection) {
        this.overdraftProtection = overdraftProtection;
    }

    //	here are my methods to manage my object

    /**
     * withdraw
     *
     * @param howMuch float - amount of money to be transferred out of he account
     * @return float - current balance of the account
     */
    public float withdraw(float howMuch) {
        //	do we have enough in the account for the transfer?
        if (balance >= howMuch) {
            balance -= howMuch;                            //	remove money from account
        } else if (overdraftProtection != null) {       //	do we have an overdraft account?
            //	is there enough between the two accounts to cover the withdrawal request
            if (overdraftProtection.getBalance() + balance > howMuch) {
                howMuch -= balance;                        //	this account will cover what it can
                balance = 0;                            //	this account will be drained
                //	take the remaining amount from the overdraft account
                overdraftProtection.withdraw(howMuch);
            } else {
                System.out.println("Even with your overdraft account you do not have sufficient funds");
            }
        } else {
            System.out.println("You have insufficient funds. Account Balance is: $" + balance);
        }
        return balance;
    }

    public float deposit(float howMuch) {
        balance += howMuch;
        return balance;
    }
    

    //		here are my constructors
    public BankAccount(String name) {        //	notice that we only have the single parameter
        this.name = name;
        this.balance = 0;            //	yup we created an account but no balance was defined
    }

    public BankAccount(String name, float balance) {    //	here we are going to use two params
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        BankAccount checking = null, savings = null;
        String accountName;
        int amount, option;

        do {
            option = Utils.getNumber("ATM Options" +
                    "\n 1 - Create Checking Account		2 - Make Deposit to Checking" +
                    "\n 3 - Create Savings Account		4 - Withdraw from Checking" +
                    "\n 5 - Xfer Checking to Savings	6 - Get Balance" +
                    "\n 7 - Xfer Savings to Checking" +
                    "\n 0 - exit");
            switch (option) {
                case 1:
                    accountName = Utils.getInput("Account Name: ");
                    amount = Utils.getNumber("Starting Balanace: ");
                    checking = new BankAccount(accountName, amount);
                    System.out.println(checking);
                    break;

                case 2:

                    if (checking != null) {
                        amount = Utils.getNumber("Amt to Deposit: ");        //	ask user for amount to deposit
                        checking.deposit(amount);                            //	make deposit
                        System.out.println(checking);                        //	show account status
                    }
                    break;

                case 3:        //	TODO - create a Savings Account
                    accountName = Utils.getInput("Account Name:  ");
                    amount = Utils.getNumber("Starting Balance");
                    savings = new BankAccount(accountName, amount);
                    System.out.println(savings);
                    break;

                case 4:    //	TODO - Withdraw from Checking
                    if (checking != null) {
                        amount = Utils.getNumber("Amt to withdraw: " + checking.getBalance() + "\nAmount to Withdraw:   ",(int)checking.getBalance());
                        checking.withdraw(amount);
                        System.out.println(checking);
                    }
                    break;

                case 5:    //	TODO - Transfer from Checking to Savings
                    if (checking != null && savings != null) {
                        amount = Utils.getNumber("Amount to transfer");
                        if (checking.getBalance() >= amount) {
                            checking.withdraw(amount);
                            savings.deposit(amount);

                        } else {
                            System.out.println("Transfer failed");
                        }
                        System.out.println(checking);
                        System.out.println(savings);
                    } else {
                        System.out.println("You must have both a checking and Savings account.");
                    }
                    break;

                case 6:    //	TODO - Get Balance for Accounts (Checking and Savings)
                    if (checking != null) {
                        System.out.println("Checking Balance :   " + checking.getBalance());
                    }
                    if (savings != null) {
                        System.out.println("Savings Balance : " + savings.getBalance());
                    }
                    break;

                case 7:    //	TODO - Transfer from Savings to Checking
                    if (checking != null && savings != null) {
                        amount = Utils.getNumber("Amount to transfer");
                        if (savings.getBalance() >= amount) {
                            savings.withdraw(amount);
                            checking.deposit(amount);

                        } else {
                            System.out.println("Not Enough Balance");
                        }
                        System.out.println(checking);
                        System.out.println(savings);
                    } else {
                        System.out.println("You must have both a checking and Savings account.");
                    }
                    break;

                case 8:  // TODO - Make my Savings account the overdraft protection account for Checking
                    if (checking != null && savings != null) {
                        checking.setOverdraftProtection(savings);
                    } else {
                        System.out.println("You must have both Checking and Savings Accounts");
                    }

            }
        } while (option != 0);
    }


}