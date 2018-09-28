public class Motor extends Receiver {
    public Motor(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println("Motor is on");
    }

    @Override
    public void off() {
        System.out.println("Motor is off");
    }
}