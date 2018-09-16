public interface State {
    void transitionTo(State state);

    void displayState();
}
