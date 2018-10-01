public class Main {
    public static void main(String [] args) {
        IterableCollection coll = new CustomIterableCollection();
        Iterator iter = coll.createIterator();

        int i = 0;
        while (iter.hasMore()) {
            String result = iter.getNext();
            System.out.println(++i + "> " + result);
        }
    }
}