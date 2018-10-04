public class BirdAdapter implements Bird {
    private PlasticToyBird toyBird;

    public BirdAdapter(PlasticToyBird toyBird) {
        this.toyBird = toyBird;
    }

    public void makeSound() {
        this.toyBird.squeak();
    }
}
