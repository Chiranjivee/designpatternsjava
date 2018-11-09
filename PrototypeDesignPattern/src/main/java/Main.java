public class Main {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("Test name");

        PrototypeRegistry registory = new PrototypeRegistry();

        registory.addPrototypeToRegistory("Original", prototype);

        ConcretePrototype clone = (ConcretePrototype) registory.getPrototypeCloneFromPrototypeRegistory("Original");

        System.out.println(prototype);
        System.out.println(clone);
    }
}