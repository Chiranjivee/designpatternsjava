public class FireTruckHandler extends AbstractHandler {
    
    @Override
    public void handle(String incomingSuspect) {
        if ("FIRE_TRUCK".equals(incomingSuspect)) {
            System.out.println("Validate id.");
            return;
        }
        this.nextHandler.handle(incomingSuspect);
    }
}