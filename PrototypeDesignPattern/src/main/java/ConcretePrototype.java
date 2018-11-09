public class ConcretePrototype implements Prototype {
    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    public ConcretePrototype(ConcretePrototype prototype) {
        this.name = prototype.name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this);
    }
}