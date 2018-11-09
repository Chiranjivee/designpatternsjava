import java.util.List;
import java.util.ArrayList;

public class Client {

    private Invoker invoker;
    private List<Command> commandList;
    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }

    public void run() {
        this.commandList = new ArrayList<>();
        Receiver receiver = new Light("Flash light");
        Command command = new TurnOnCommand(receiver);

        commandList.add(command);

        invoker = new Invoker(command);
        invoker.executeCommand();

        Receiver receiver2 = new Motor("Motor");
        Command command2 = new TurnOnCommand(receiver2);
        commandList.add(command2);

        invoker.setCommand(command2);
        invoker.executeCommand();

        commandList.forEach(commandBackup -> {
            invoker.setCommand(commandBackup);
            invoker.undoCommand();
        });
    }
}