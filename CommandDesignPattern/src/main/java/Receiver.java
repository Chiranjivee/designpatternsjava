public abstract class Receiver { 
    protected String name;

    public Receiver(String name) {
        this.name = name;
    }

    abstract void on();
    abstract void off();
}