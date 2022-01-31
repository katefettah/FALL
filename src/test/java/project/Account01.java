package project;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account01 {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance;
    private double savingBalance;

    Scanner scan=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");

    public int getCustomerNumber() {
        this.customerNumber=customerNumber;
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }
    public double calcSavingWithdraw(double amount){
        savingBalance=(checkingBalance+amount);
        return savingBalance;
    }
    public void getCheckingWithdrawInput(){
        System.out.println("Balance: "+moneyFormat.format(checkingBalance));
    }
}
