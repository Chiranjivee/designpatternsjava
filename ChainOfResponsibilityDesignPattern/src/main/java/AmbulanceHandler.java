public class AmbulanceHandler extends AbstractHandler {
    
    @Override
    public void handle(String incomingSuspect) {

        if ("AMBULANCE".equals(incomingSuspect)) {
            System.out.println("Validate id quickly.");
            System.out.println("Let go.");
            return;
        }
        this.nextHandler.handle(incomingSuspect);
    }
}