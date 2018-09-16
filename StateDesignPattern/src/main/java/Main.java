public class Main {
    public static void main(String[] args) {
        LightBulb bulb = new LightBulb();
        bulb.displayState();

        bulb.toggle();
        bulb.displayState();

        bulb.toggle();
        bulb.displayState();

        bulb.toggle();
        bulb.displayState();
    }
}
