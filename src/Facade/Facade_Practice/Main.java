package Facade.Facade_Practice;

import Facade.Facade_Practice.atm.AtmMachineFacade;

public class Main {
    public static void main(String[] args) {


        AtmMachineFacade atmMachineFacade = new AtmMachineFacade();
        atmMachineFacade.withdrawMoney();

    }
}
