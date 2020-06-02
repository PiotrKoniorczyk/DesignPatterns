package State.State_Practice;


import State.State_Practice.state.NoCoinState;

public class SlotMachine {


    public State state;

    public SlotMachine() {
        this.state = new NoCoinState();
    }

    public void insertTheCoin() {
        state.insertTheCoin(this);
    }

    public void pushTheLever() {
        state.pushTheLever(this);
    }

    public void collectTheWinnings() {
        state.collectTheWinnings(this);
    }

    public void currentState() {
        state.currentState(this);
    }
}