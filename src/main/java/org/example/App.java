package org.example;

/**
 * Bank Account Kata Main class
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BankAccount bankAccount = new BankAccount();

        bankAccount.makeDeposit(100);

        bankAccount.makeWithdrawal(20);

        bankAccount.showMeHistoryOfOperations();
    }
}
