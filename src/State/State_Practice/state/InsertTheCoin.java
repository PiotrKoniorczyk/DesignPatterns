package State.State_Practice.state;

import State.State_Practice.SlotMachine;
import State.State_Practice.State;

import java.util.Random;

public class InsertTheCoin implements State {

    @Override
    public void insertTheCoin(SlotMachine slotMachine) {
        System.out.println("Moneta włożona");

    }

    @Override
    public void pushTheLever(SlotMachine slotMachine) {
        System.out.println("Trwa losowanie");
        Random random = new Random();
        int draw = random.nextInt(10);
        boolean win = false;
        if(draw == 1|| draw == 2){
            win = true;
            slotMachine.state = new CollectTheWinnings();
        }else{
            System.out.println("Spróbuj ponownie");
            slotMachine.state = new NoCoinState();
        }

    }

    @Override
    public void collectTheWinnings(SlotMachine slotMachine) {
        System.out.println("Pociągnij dźwignie.");
    }

    @Override
    public void currentState(SlotMachine slotMachine) {
        System.out.println("Aktualny stan - MONETA WŁOŻONA");
    }
}