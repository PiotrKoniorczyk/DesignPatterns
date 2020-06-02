package Facade.Facade_Practice.atm;

import java.util.Scanner;

class AtmMachine {
    int checkBalance(){
        int balance = 1000;
        System.out.println("Na twoim koncie jest: " + balance);
        return balance;
    }
    int enterPin(){
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter your pin: ");
        int enterPin = enter.nextInt();
        System.out.println("Pin entered.");
        return enterPin;

        }

    void withdrawCash(){
        System.out.println("Cash withdrawn successfully!");
    }

}
