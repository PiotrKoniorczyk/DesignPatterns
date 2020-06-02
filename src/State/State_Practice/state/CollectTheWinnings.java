package State.State_Practice.state;

import State.State_Practice.SlotMachine;

public class CollectTheWinnings implements State.State_Practice.State {

    @Override
    public void insertTheCoin(SlotMachine slotMachine) {
        System.out.println("Zabierz monety");
    }

    @Override
    public void pushTheLever(SlotMachine slotMachine) {
        System.out.println("Zabierz monety");

    }

    @Override
    public void collectTheWinnings(SlotMachine slotMachine) {
        System.out.println("Zabrano monety");
        slotMachine.state = new NoCoinState();

    }

    @Override
    public void currentState(SlotMachine slotMachine) {
        System.out.println("Stan - Wygrana");
    }
}
