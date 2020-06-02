package Facade.Facade_Practice.atm;

import java.util.ArrayList;
import java.util.List;

class BankSystem {

    AtmMachine atmMachine = new AtmMachine();
    public static List<Integer> transactionHistories = new ArrayList<Integer>();


    void transferMoney(int money,String recipient){
        System.out.println("Transfer "+money +"Euro to :" + recipient);

    }

    boolean validatePin() {
        int customerPin = 1234;
        if (atmMachine.enterPin() == customerPin) {
            System.out.println("PIN number validated.");
            return true;
        } else {
            System.out.println("PIN number not validated.");
            return false;
        }
    }

    boolean validateTransaction(){
        if(validatePin() == true) {
            System.out.println("Transaction validated.");
            return true;
        }else{
            System.out.println("Transaction not validated.");
            return false;
        }
    }

    void getTransactionHistory(){
        for (int i = 0; i <transactionHistories.size() ; i++) {
            System.out.println(transactionHistories.get(i));
        }
    }
}
