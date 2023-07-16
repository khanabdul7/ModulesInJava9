package com.abdul.account.dao;

import com.abdul.customer.dao.Customer;

public class LoanAccount {
    private String accountId;
    private String AccountType;
    private Customer customerId;
    private int roi;
    private String loanType;
    private int principal;
    private short monthDuration;

    public LoanAccount(String accountId, String accountType, Customer customerId, int roi, String loanType, int principal, short monthDuration) {
        this.accountId = accountId;
        AccountType = accountType;
        this.customerId = customerId;
        this.roi = roi;
        this.loanType = loanType;
        this.principal = principal;
        this.monthDuration = monthDuration;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public int getRoi() {
        return roi;
    }

    public void setRoi(int roi) {
        this.roi = roi;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public int getPrincipal() {
        return principal;
    }

    public void setPrincipal(int principal) {
        this.principal = principal;
    }

    public short getMonthDuration() {
        return monthDuration;
    }

    public void setMonthDuration(short monthDuration) {
        this.monthDuration = monthDuration;
    }

    @Override
    public String toString() {
        return "LoanAccount{" +
                "accountId='" + accountId + '\'' +
                ", AccountType='" + AccountType + '\'' +
                ", customerId=" + customerId +
                ", roi=" + roi +
                ", loanType='" + loanType + '\'' +
                ", principal=" + principal +
                ", monthDuration=" + monthDuration +
                '}';
    }
}

