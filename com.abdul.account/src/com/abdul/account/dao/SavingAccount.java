package com.abdul.account.dao;

import com.abdul.customer.dao.Customer;

public class SavingAccount {
    private String accountId;
    private String accountType;
    private Customer customerId;
    private short minBalance;
    private int balance;

    public SavingAccount(String accountId, String accountType, Customer customerId, short minBalance, int balance) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.customerId = customerId;
        this.minBalance = minBalance;
        this.balance = balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public short getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(short minBalance) {
        this.minBalance = minBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId='" + accountId + '\'' +
                ", accountType='" + accountType + '\'' +
                ", customerId=" + customerId +
                ", minBalance=" + minBalance +
                ", Balance=" + balance +
                '}';
    }
}

