package Command.Command_Lesson.Workshop.command;

import Command.Command_Lesson.Workshop.CoffeMaker;

public class CoffeMakerTurnOnCommand implements Command{
    CoffeMaker coffeMaker;

    public CoffeMakerTurnOnCommand(CoffeMaker coffeMaker) {
        this.coffeMaker = coffeMaker;
    }

    public void execute() {
        coffeMaker.TurnOn();
    }

    @Override
    public void undo() {
        coffeMaker.TurnOff();
    }
}
