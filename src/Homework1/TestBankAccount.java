package Homework1;

public class TestBankAccount {

    public static void main(String[] args){
        BankAccount investmentAccount = new BankAccount("23848234", 2000);

        investmentAccount.drawMoney(500);
        investmentAccount.drawMoney(1600);
        investmentAccount.deposit(1200);

        System.out.println("Account Number: " + investmentAccount.getAccountNumber() +
                           "\nAccount Balance: " + investmentAccount.getAccountBalance() );
    }
}
