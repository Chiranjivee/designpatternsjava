public class PoliceVehicleHandler extends AbstractHandler {
    
    @Override
    public void handle(String incomingSuspect) {

        if ("POLICE_SUV".equals(incomingSuspect)) {
            System.out.println("validate id.");
            System.out.println("Give access.");
            return;
        }
        this.nextHandler.handle();
    }
}