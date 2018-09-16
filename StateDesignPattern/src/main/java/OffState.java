public class OffState implements State {
    LightBulb bulb;

    public OffState(LightBulb bulb) {
        this.bulb = bulb;
    }

    public void transitionTo(State nextState) {
        this.bulb.setCurrentState(nextState);
    }

    public void displayState() {
        System.out.println("LightBulb is turned off.");
    }
}
