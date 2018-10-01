import java.util.List;
import java.util.ArrayList;

public class RadioStation implements Subject {

    private List<Observer> myObservers = new ArrayList<>();
    private int goldenNumber = 2;

    @Override
    public void register(Observer o) {
        myObservers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        myObservers.remove(o);
    }

    @Override
    public void notifyObserver() {
        myObservers.stream().forEach((Observer o) -> o.notifyMe(goldenNumber));
    }

    public void updateGoldenNumber(int i) {
        this.goldenNumber = i;
        notifyObserver();
    }
}