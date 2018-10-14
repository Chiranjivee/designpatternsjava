public class PrototypeRegistory {
    private Map<String, Protype> prototypeRegistry;

    public PrototypeRegistory() {
        this.prototypeRegistry = new HashMap<>();
    }

    public void addPrototypeToRegistory(String prototypeName, Prototype prototype) {
        this.prototypeRegistry.put(prototypeName, prototype);
    }

    public Prototype getPrototypeCloneFromPrototypeRegistory(String name) {
        this.prototypeRegistry.get(name).clone();
    }
}