package hub;
import commands.Command;
import java.util.Stack;

public class SmartHomeHub {
    private Stack<Command> commandHistory;
    
    public SmartHomeHub() {
        this.commandHistory = new Stack<>();
    }
    
    public void executeCommand(Command command) {
        command.execute();
        commandHistory.push(command);
    }
    
    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        } else {
            System.out.println("No commands to undo");
        }
    }
    
    public void showCommandHistory() {
        System.out.println("=== Command History ===");
        if (commandHistory.isEmpty()) {
            System.out.println("No commands executed yet");
        } else {
            for (int i = 0; i < commandHistory.size(); i++) {
                System.out.println((i + 1) + ". " + commandHistory.get(i).getClass().getSimpleName());
            }
        }
    }
}