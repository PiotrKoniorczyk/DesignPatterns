package Facade.Facade_Practice.atm;

public class AtmMachineFacade {
    AtmMachine atmMachine = new AtmMachine();
    BankSystem bankSystem = new BankSystem();

    public void withdrawMoney(){
        if(bankSystem.validateTransaction() == true){
            atmMachine.withdrawCash();
        }

    }
}
