package Operators;

public class BankAccount {
    public static void main(String[] args) {
        //Declares Variables
        String accountHolderName = "Java";
        double accountBalance = 5000.0;
        double depositAmount = 1000.0;
        double withdrawalAmount = 2500.0;
        int numberOfTransactions = 0;
        int minThreshold = 100;
        //boolean isActive = true;
        //Update the balance after deposit and withdrawal.
        //Increase number of transactions with each operation.
        //Deposit
        accountBalance = accountBalance + depositAmount;
        numberOfTransactions++;
        //Withdrawl
        accountBalance = accountBalance - withdrawalAmount;
        numberOfTransactions++;

        //Check if balance is below minimum threshold.
        boolean belowMinimum = accountBalance > minThreshold;

        //Verify if deposit is valid and account is active.
        boolean accountIsActive = (depositAmount > 0) || (withdrawalAmount > 0);
        boolean isValid = (depositAmount > 0) && accountIsActive;

        //Print
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Final Balance: " + accountBalance);
        System.out.println("Number of Transactions: " + numberOfTransactions);
        System.out.println("Verify account is active: " + accountIsActive);
        System.out.println("Verify if deposit is valid: " + isValid);
        System.out.println("Check if balance is below minimum threshold: " + belowMinimum);
    }
}
