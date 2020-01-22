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

        String operation = createOperation("deposit", "22/01/2020", deposit, balance);

        historyOfOperations.add(operation);
    }

    public void makeWithdrawal(int withdrawal) {
        balance -= withdrawal;

        String operation = createOperation("withdrawal", "22/01/2020", withdrawal, balance);
        historyOfOperations.add(operation);
    }

    public String createOperation(String operationName, String dateOfTheDay, int amount, int balance) {
        final String SEPARATOR = " | ";
        StringBuilder operation = new StringBuilder();

        return operation.append(operationName)
                .append(SEPARATOR)
                .append(dateOfTheDay)
                .append(SEPARATOR)
                .append(amount)
                .append(SEPARATOR)
                .append(balance)
                .toString();
    }

    public int getBalance() {
        return balance;
    }

    public List<String> getHistoryOfOperations() {
        return historyOfOperations;
    }
}
