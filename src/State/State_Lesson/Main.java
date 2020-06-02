package State.State_Lesson;

public class Main {
    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.insertTheCoin();
        coffeeMachine.pushTheButton();
        coffeeMachine.takeTheCup();
    }
}
