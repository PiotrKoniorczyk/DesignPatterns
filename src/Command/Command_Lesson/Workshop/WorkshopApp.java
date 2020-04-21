package Command.Command_Lesson.Workshop;

import Command.Command_Lesson.Workshop.command.Command;

import java.util.ArrayList;
import java.util.List;

public class WorkshopApp {

    private List<Command> commandQueue = new ArrayList<Command>();

    public void addToQueue(Command command) {
        commandQueue.add(command);
    }

    public void run() {
        if (commandQueue.isEmpty()) {
            System.out.println("Kolejka nie zawiera żadnych komend");
        }
        for (Command command : commandQueue) {
            command.execute();
        }commandQueue.clear();
        }

    public void undoComand(){
        for(Command command:commandQueue){
            command.undo();
        }
    }
}
