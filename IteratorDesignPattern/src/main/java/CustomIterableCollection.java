import java.util.List;
import java.util.ArrayList;

public class CustomIterableCollection implements IterableCollection {
    private List<String> internalList = new ArrayList<>();

    public Iterator createIterator() {
        return new CustomIterableCollectionIterator();
    }

    public CustomIterableCollection() {
        internalList.add("I");
        internalList.add("love");
        internalList.add("binary.");
    }
    public int size() {
        this.internalList.size();
    }

    public String getStringAtIndex(int i) {
        return this.internalList.get(i);
    }
}