package Command.Command_Lesson.Workshop.command;

import Command.Command_Lesson.Workshop.Robot;

public class RobotCutCommand implements Command{

    Robot robot;

    public RobotCutCommand(Robot robot) {
        this.robot = robot;
    }

    public void execute() {
        robot.cut();
    }

    public void undo() {

    }
}
