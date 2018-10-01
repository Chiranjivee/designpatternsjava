public class Main {
    public static void main(String[] args) {
        Subject radio = new RadioStation();
        Observer ob1 = new Person("Vlad");
        Observer ob2 = new Person("Niko");
        Observer ob3 = new Person("Roman");
        Observer ob4 = new Person("Faustin");

        radio.notifyObserver();
        radio.register(ob1);
        radio.register(ob2);

        radio.notifyObserver();
        radio.register(ob3);
        ((RadioStation) radio).updateGoldenNumber(4);

        radio.unregister(ob1);
        radio.unregister(ob2);
        radio.register(ob4);

        ((RadioStation) radio).updateGoldenNumber(10);
    }
}
