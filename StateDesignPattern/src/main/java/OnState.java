public class OnState implements State {
    LightBulb bulb;

    public OnState(LightBulb bulb) {
        this.bulb = bulb;
    }

    public void transitionTo(State nextState) {
        this.bulb.setCurrentState(nextState);
    }

    public void displayState() {
        System.out.println("LightBulb is turned on.");
    }
}
