package Command.Command_Lesson.Workshop.command;

import Command.Command_Lesson.Workshop.Robot;

public class RobotTurnOnCommand implements Command {


    private Robot robot;

    public void execute() {
        robot.turnOn();
    }

    public RobotTurnOnCommand(Robot robot) {
        this.robot = robot;
    }

    public void undo() {
        robot.turnOff();

    }
}
