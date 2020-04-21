package Command.Command_Lesson.Workshop.command;

import Command.Command_Lesson.Workshop.CoffeMaker;

public class CoffeMakerTurnOffCommand implements Command {
    CoffeMaker coffeMaker;

    public CoffeMakerTurnOffCommand(CoffeMaker coffeMaker) {
        this.coffeMaker = coffeMaker;
    }

    public void execute() {
        coffeMaker.TurnOff();
    }

    @Override
    public void undo() {
        coffeMaker.TurnOn();
    }
}
