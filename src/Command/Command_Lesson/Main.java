package Command.Command_Lesson;

import Command.Command_Lesson.Workshop.CoffeMaker;
import Command.Command_Lesson.Workshop.Robot;
import Command.Command_Lesson.Workshop.WorkshopApp;
import Command.Command_Lesson.Workshop.command.*;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        WorkshopApp workshopApp = new WorkshopApp();
        workshopApp.addToQueue(new RobotTurnOnCommand(robot));
        workshopApp.addToQueue(new RobotCutCommand(robot));
        workshopApp.addToQueue(new RobotDrillCommand(robot));
        workshopApp.addToQueue(new RobotTurnOffCommand(robot));

        workshopApp.run();
        workshopApp.run();

        System.out.println("---------------------------");

        CoffeMaker coffeMaker = new CoffeMaker();
        workshopApp.addToQueue(new CoffeMakerTurnOnCommand(coffeMaker));
        workshopApp.addToQueue(new CoffeMakerTurnOffCommand(coffeMaker));

        workshopApp.run();
        workshopApp.run();

        System.out.println("---------------------------");

        workshopApp.addToQueue(new RobotTurnOnCommand(robot));

        workshopApp.run();
        //workshopApp.undoComand();   (Workshop can not have clear method)




    }
}
