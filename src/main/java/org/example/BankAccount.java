package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private int balance = 0;
    private ArrayList historyOfOperations = new ArrayList();

    public BankAccount() {
    }

    public void makeDeposit(int deposit) {
        balance += deposit;

        String operation = createOperation(
                "deposit",
                getDateOfTodayFormatted(),
                deposit,
                balance
        );

        historyOfOperations.add(operation);
    }

    public void makeWithdrawal(int withdrawal) {
        balance -= withdrawal;

        String operation = createOperation(
                "withdrawal",
                getDateOfTodayFormatted(),
                withdrawal,
                balance
        );
        historyOfOperations.add(operation);
    }

    private String getDateOfTodayFormatted(){
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return localDate.format(formatter);
    }

    private String createOperation(String operationName, String dateOfTheDay, int amount, int balance) {
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

    public void showMeHistoryOfOperations() {
        getHistoryOfOperations()
                .forEach(System.out::println);
    }
}
