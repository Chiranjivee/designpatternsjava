public class Main {

    public static void main(String [] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setArticle("State 1");
        careTaker.addMemento(originator.save());

        printState(originator);

        originator.setArticle("State 2");
        careTaker.addMemento(originator.save());
        printState(originator);

        originator.restore(careTaker.undo());
        printState(originator);

        originator.restore(careTaker.undo());
        printState(originator);

        originator.restore(careTaker.undo());
        printState(originator);

        originator.restore(careTaker.redo());
        printState(originator);

        originator.restore(careTaker.redo());
        printState(originator);

        originator.setArticle("State 3");
        careTaker.addMemento(originator.save());
        printState(originator);
        originator.setArticle("State 4");
        careTaker.addMemento(originator.save());
        printState(originator);

        originator.setArticle("State 5");
        careTaker.addMemento(originator.save());
        printState(originator);

        originator.setArticle("State 6");
        careTaker.addMemento(originator.save());
        printState(originator);

        originator.restore(careTaker.undo());
        originator.restore(careTaker.undo());
        originator.restore(careTaker.undo());

        printState(originator);

        originator.restore(careTaker.redo());
        printState(originator);
    }

    public static void printState(Originator o) {
        System.out.println("Current State: " + o.getArticle());
    }
}
