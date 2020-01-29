package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankAccountTest {

    /* US 1:
    * In order to save money
    * As a bank client
    * I want to make a deposit in my account
    */
    @Test
    void shouldMakeADepositInMyAccount(){
        // given
        BankAccount bankAccount = new BankAccount();
        int deposit = 100;
        // when
        bankAccount.makeDeposit(deposit);
        // then
        assertEquals(deposit, bankAccount.getBalance());
    }

    /* US 2:
    * In order to retrieve some or all of my savings
    * As a bank client
    * I want to make a withdrawal from my account
    */
    @Test
    void shouldMakeAWithdrawalFromMyAccount(){
        // given
        BankAccount bankAccount = new BankAccount();
        int withdrawal = 20;
        int expectedAccountStatement = -20;
        // when
        bankAccount.makeWithdrawal(withdrawal);
        // then
        assertEquals(expectedAccountStatement, bankAccount.getBalance());
    }

    /* US 3:
     * In order to check my operations
     * As a bank client
     * I want to see the history (operation, date, amount, balance)  of my operations
     */
    @Test
    void shouldSeeTheHistoryOfMyOperations(){
        // given
        BankAccount bankAccount = new BankAccount();
        int deposit = 100;
        int withdrawal = 20;
        List<String> expectedHistory = List.of("deposit | 29/01/2020 | 100 | 100", "withdrawal | 29/01/2020 | 20 | 80");
        // when
        bankAccount.makeDeposit(deposit);
        bankAccount.makeWithdrawal(withdrawal);
        // then
        assertEquals(expectedHistory, bankAccount.getHistoryOfOperations());
    }
}