import java.util.List;
import java.util.ArrayList;

public class Client {

    private Invoker invoker;
    private List<Command> commandList;
    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }

    public void run2() {
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

    public void run() {
        // What if you don't want this light.
        // What if you want to change this light;.
        // The only intent here is to turn the light on
        // and not care about the light itself.
        Light light = new Light();
        light.turnOn();
        light.turnOff();


        // Cool some abstraction here, but still our 
        // poor button is still stuck with this kind of light
        // What if we wanted to use our cool little button 
        // for other tasks, like turning on a motor.
        Button button = new Button(light);
        button.on();

        // OCP violation - also sub-classing will lead to a 
        // huge number of classes if more equipments are added.
        MotorButton mtrButton = new MotorButton(new Motor());
        mtrButton.on();

        button.off();
        mtrButton.off();
    }
}