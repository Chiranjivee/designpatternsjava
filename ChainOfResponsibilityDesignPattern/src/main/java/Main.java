public class Main {
    public static void main(String[] args) {
        String incomingSuspect = "CIVILIAN_SUV";
        if (incomingSuspect.equals("CIVILIAN_SUV")) {
            System.out.println("Validate id.");
            System.out.println("Do exhaustive search.");
            System.out.println("Minor interrogation.");
        } else if (incomingSuspect.equals("FIRE_TRUCK")) {
            System.out.println("Validate id.");
        } else if (incomingSuspect.equals("AMBULANCE")) {
            System.out.println("Validate id quickly.");
            System.out.println("Let go.");
        } else if (incomingSuspect.equals("POLICE_SUV")) {
            System.out.println("validate id.");
            System.out.println("Give access.");
        } else {
            System.out.println("Stop right there.");
        }
    }
}