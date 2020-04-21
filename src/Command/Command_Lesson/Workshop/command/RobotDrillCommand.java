package Command.Command_Lesson.Workshop.command;

import Command.Command_Lesson.Workshop.Robot;

public class RobotDrillCommand implements Command {

    Robot robot;

    public RobotDrillCommand(Robot robot) {
        this.robot = robot;
    }

    public void execute() {
        robot.drill();
    }

    public void undo() {

    }
}
