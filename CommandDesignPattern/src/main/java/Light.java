public class Light extends Receiver {
    public Light(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println("Light is on");
    }

    @Override
    public void off() {
        System.out.println("Light is off");
    }
}