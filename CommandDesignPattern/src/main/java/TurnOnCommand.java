public class TurnOnCommand implements Command {
    private Receiver receiver;

    public TurnOnCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.on();
    }

    public void undo() {
        receiver.off();
    }
}