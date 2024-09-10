package bank;

import exception.AmountCantBeGreaterThanBalance;
import exception.DepositAmountCannotBeNegative;

public class Account {
    private String name;
    private String pin;
    private double balance;
    private String number;

    public void createAccount(String firstName, String lastName, String pin) {
        Account account = new Account();
        this.name = firstName + " " + lastName;
        this.pin = pin;
    }

    public double checkBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new DepositAmountCannotBeNegative("Negative amount");
        } else {
            if (amount > 0) {
                balance += amount;

            }
        }

    }

    public double withdraw(double amount, String pin) {
        if (amount > balance) {
            throw new AmountCantBeGreaterThanBalance("insufficient balance");
        } else {
            if (amount < balance) {
                balance -= amount;
            }
            return balance;
        }
    }

    public void getPin(String number){
        this.pin = pin;
    }

    public String getNumber() {
        return number;

    }
}


