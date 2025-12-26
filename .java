package simpleproject;

import java.util.Scanner;

public class Simpleatm {
    private static double balance = 1000.0;
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean running = true;
        
        System.out.println("Welcome to Simple ATM");
        
        while(running) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            
            int choice = scanner.nextInt();
            
            switch(choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    running = false;
                    System.out.println("Thank you for using ATM!");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
    
    private static void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }
    
    private static void deposit() {
        System.out.print("Enter amount to deposit: $");
        double amount = scanner.nextDouble();
        
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! New balance: $" + balance);
        } else {
            System.out.println("Invalid amount");
        }
    }
    
    private static void withdraw() {
        System.out.print("Enter amount to withdraw: $");
        double amount = scanner.nextDouble();
        
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: $" + balance);
        } else if(amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            System.out.println("Invalid amount");
        }
    }
}
