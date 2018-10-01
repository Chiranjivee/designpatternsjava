public class CustomIterableCollectionIterator implements Iterator {


    private CustomIterableCollection collection;
    private int size;
    private int currentIndex = -1;
    public CustomIterableCollectionIterator(CustomIterableCollection collection) {
        this.collection = collection;
        this.size = collection.size();
    }

    @Override
    public String getNext() {
        currentIndex++;
        return this.collection.getStringAtIndex(currentIndex);
    }

    @Override
    public boolean hasMore() {
        return currentIndex + 1 < size;
    }
}