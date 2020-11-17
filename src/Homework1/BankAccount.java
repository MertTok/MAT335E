package Homework1;

import java.sql.SQLOutput;

public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private double previousAccountBalance;

    BankAccount(String accountNumber, double accountBalance){
        setAccountNumber(accountNumber);
        setAccountBalance(accountBalance);
        setPreviousAccountBalance(accountBalance);
    }

    // Getters and Setters
    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance(){
        return this.accountBalance;
    }

    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }

    public double getPreviousAccountBalance(){
        return this.previousAccountBalance;
    }

    public void setPreviousAccountBalance(double previousAccountBalance){
        this.previousAccountBalance = previousAccountBalance;
    }

    // Helper methods
    public void drawMoney(double amount){
        double currentBalance = getAccountBalance();
        double adjustedAmount = amount;
        boolean wentOverLimit = false;

        if(amount > 1500) {
            adjustedAmount += 10;
            wentOverLimit = true;
            System.out.println("You will be commissioned additional 10 TL since the amount went over the withdrawal limit of 1500 TL.");
        }

        if(adjustedAmount > currentBalance)
        {
            System.out.println("You don't have enough funds to make this withdrawal!");
            System.out.println("Required funds is " + adjustedAmount + " TL while account balance is " + currentBalance + " TL");
            MessageForTransaction(true);
            return;
        }

        setAccountBalance( currentBalance - amount );

        MessageForTransaction(amount, true);

        if(wentOverLimit) System.out.println("You were charged an additional 10 TL for this withdrawal.");

        setPreviousAccountBalance( currentBalance );
    }


    public void deposit(double amount){
        double currentBalance = getAccountBalance();

        if(amount > 3000) {
            System.out.println("You may not deposit more than 3000 TL at once.");
            MessageForTransaction(true);
            return;
        }

        setAccountBalance( currentBalance + amount );
        setPreviousAccountBalance( currentBalance );
        MessageForTransaction(amount, false);
    }


    public void MessageForTransaction(boolean failedTransaction){
        System.out.println("Transaction was unsuccessful, aborting.");
        System.out.println("\n-------------------------------------------\n");
    }


    public void MessageForTransaction(double amount, boolean isWithdrawal){
        if(isWithdrawal)
        {
            System.out.println("You have successfully withdrawn " + amount + " TL");
        }
        else
        {
            System.out.println("You have successfully deposited " + amount + " TL");
        }

        System.out.println("Previous Account Balance: " + getPreviousAccountBalance() + " TL");

        System.out.println("Transaction Amount: " + (getAccountBalance() - getPreviousAccountBalance()) + " TL");

        System.out.println("Final Account Balance: " + getAccountBalance());

        System.out.println("\n-------------------------------------------\n");
    }
}
