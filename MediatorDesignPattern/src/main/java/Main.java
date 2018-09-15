public class Main {
    public static void main(String [] args) {
        Mediator mediator = new ConcreteMediator();

        Component compA = new ComponentA(mediator);
        Component compB = new ComponentB(mediator);

        mediator.register(compA);
        mediator.register(compB);

        compA.send();

        System.out.println();

        compB.send();
    }
}
