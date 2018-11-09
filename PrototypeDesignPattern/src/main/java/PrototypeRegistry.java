import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private Map<String, Prototype> prototypeRegistry;

    public PrototypeRegistry() {
        this.prototypeRegistry = new HashMap<>();
    }

    public void addPrototypeToRegistory(String prototypeName, Prototype prototype) {
        this.prototypeRegistry.put(prototypeName, prototype);
    }

    public Prototype getPrototypeCloneFromPrototypeRegistory(String name) {
        return this.prototypeRegistry.get(name).clone();
    }
}