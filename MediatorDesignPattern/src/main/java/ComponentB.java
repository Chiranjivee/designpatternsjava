public class ComponentB extends Component {

    public ComponentB(Mediator m) {
        super("Component-B", m);
    }

    @Override
    public void send() {
        String message = "Hey!! What's up";

        System.out.println("B is sending: " + message);

        this.mediator.notify(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println("Component B got: " + message);
    }


}
