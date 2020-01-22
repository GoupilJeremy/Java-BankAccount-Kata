package org.example;

import java.util.List;

public class BankAccount {
    private int accountStatement = 0;

    public void makeDeposit(int deposit) {
        accountStatement += deposit;
    }

    public void makeWithdrawal(int withdrawal) {
        accountStatement -= withdrawal;
    }

    public int getAccountStatement() {
        return accountStatement;
    }

    public List<String> getHistoryOfOperations() {
        return List.of("");
    }
}
