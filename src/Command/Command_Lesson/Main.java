package Command.Command_Lesson;

import Command.Command_Lesson.Workshop.Robot;
import Command.Command_Lesson.Workshop.WorkshopApp;

public class Main {
    public static void main(String[] args) {
        WorkshopApp workshopApp = new WorkshopApp(new Robot());
        workshopApp.run();
    }
}
