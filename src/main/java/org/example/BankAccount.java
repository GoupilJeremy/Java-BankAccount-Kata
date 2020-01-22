package org.example;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private int balance = 0;
    private List<String> historyOfOperations = new ArrayList();

    public BankAccount() {
    }

    public void makeDeposit(int deposit) {
        balance += deposit;
        StringBuilder operation = new StringBuilder();
        operation.append("deposit")
                .append(" | ")
                .append(" 22/01/2020 ")
                .append(" | ")
                .append(deposit)
                .append(" | ")
                .append(balance);

        historyOfOperations.add(operation.toString());
    }

    public void makeWithdrawal(int withdrawal) {
        balance -= withdrawal;
    }

    public int getBalance() {
        return balance;
    }

    public List<String> getHistoryOfOperations() {
        return historyOfOperations;
    }
}
