import java.util.HashMap;
import java.util.Map;

public class LightBulb {
    private Map<State, State> lightBulbStateMap =
        new HashMap<>();

    State currentState;

    public LightBulb() {
        State onState = new OnState(this);
        State offState = new OffState(this);
        this.lightBulbStateMap.put(onState, offState);
        this.lightBulbStateMap.put(offState, onState);
        currentState = offState;
    }

    public void setCurrentState(State state) {
        this.currentState = state;
    }

    public void displayState() {
        this.currentState.displayState();
    }

    public void toggle() {
        this.currentState.transitionTo(lightBulbStateMap.get(currentState));
    }
}
