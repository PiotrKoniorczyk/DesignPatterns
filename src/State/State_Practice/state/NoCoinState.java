package State.State_Practice.state;

import State.State_Practice.SlotMachine;
import State.State_Practice.State;

public class NoCoinState implements State {
    @Override
    public void insertTheCoin(SlotMachine slotMachine) {
        System.out.println("Moneta włożona");
        slotMachine.state = new InsertTheCoin();
    }

    @Override
    public void pushTheLever(SlotMachine slotMachine) {
        System.out.println("Włóż monete");
    }

    @Override
    public void collectTheWinnings(SlotMachine slotMachine) {
        System.out.println("Włóż monete");
    }

    @Override
    public void currentState(SlotMachine slotMachine) {
        System.out.println("Stan - Brak monety");

    }
}
