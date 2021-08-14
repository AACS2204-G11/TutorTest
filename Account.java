package src.p6;

import java.util.Date;
import java.util.Objects;
import java.util.Scanner;


public class Account {
    private String accountNo;
    private double balance;
    private Date date;
    private int test;

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.date = new Date();
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public void deposit(double amt){
        this.balance += amt;
    }
    public void withdrawal(double amt){
        this.balance -= amt;

    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo='" + accountNo + '\'' +
                ", balance=" + balance +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Account acc = (Account)obj;
        return acc.getAccountNo() == this.getAccountNo();
    }
}
