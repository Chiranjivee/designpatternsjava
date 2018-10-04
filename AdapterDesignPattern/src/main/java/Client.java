public class Client {
    public static void main(String[] args) {
        Bird duck = new Duck();
        duck.makeSound();

        Bird toyBird = new BirdAdapter(new WinnieThePenguin());
        toyBird.makeSound();
    }
}