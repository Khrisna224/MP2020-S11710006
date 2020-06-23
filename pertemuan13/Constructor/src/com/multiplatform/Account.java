package com.multiplatform;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    public Account(){

    }
    public Account(String number, double balance, String customerName, String emailAddress, String phoneNumber){
        this.number = number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
