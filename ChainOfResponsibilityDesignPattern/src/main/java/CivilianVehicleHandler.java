public class CivilianVehicleHandler extends AbstractHandler {
    
    @Override
    public void handle(String incomingSuspect) {

        if ("CIVILIAN_SUV".equals(incomingSuspect)) {
            System.out.println("Validate id.");
            System.out.println("Do exhaustive search.");
            System.out.println("Minor interrogation.");
            return;
        }
        this.nextHandler.handle();
    }
}