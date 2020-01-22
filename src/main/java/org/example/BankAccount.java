package org.example;

public class BankAccount {
    private int accountStatement = 0;
    public void makeDeposit(int deposit) {
        accountStatement += deposit;
    }

    public int getAccountStatement() {
        return accountStatement;
    }
}
