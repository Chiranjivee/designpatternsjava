public class MainWithChainOfResponsibility {
    public static void main(String[] args) {
        MainWithChainOfResponsibility demo = new MainWithChainOfResponsibility();
        Handler vehicleHandler = demo.getValidationHandler();
        String incomingSuspect = "POLICE_SUV";
        vehicleHandler.handle(incomingSuspect);
    }

    public Handler getValidationHandler() {
        Handler civilianHandler = new CivilianVehicleHandler();
        Handler fireTruckHandler = new FireTruckHandler();
        Handler ambulanceHandler = new AmbulanceHandler();
        Handler policHandler = new PoliceVehicleHandler();

        civilianHandler.setNextHandler(fireTruckHandler);
        fireTruckHandler.setNextHandler(ambulanceHandler);
        ambulanceHandler.setNextHandler(policHandler);

        return civilianHandler;
    }
}