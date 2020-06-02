package State.State_Practice;


public interface State {
    void insertTheCoin(SlotMachine slotMachine);
    void pushTheLever(SlotMachine slotMachine);
    void collectTheWinnings(SlotMachine slotMachine);
    void currentState(SlotMachine slotMachine);

}
