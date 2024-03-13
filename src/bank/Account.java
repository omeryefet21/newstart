package bank;

import java.util.Scanner;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter amount to deposit: ");
        double amount= scanner.nextDouble();
        if (amount>0) {
            balance = balance + amount;
        }
        else {
            System.out.println("Invalid amount");
        }
    }
    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && balance - amount >= 0) {
            balance = balance - amount;
        } else {
            System.out.println("Invalid amount/insufficient funds");
        }
    }
}
