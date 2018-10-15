public class Main {
    public static void main(String[] args) {
        RobotBuilder builder = new HumonoidRobotBuilder();
        builder.initBot();
        builder.assembleArms();
        builder.assembleLegs();
        builder.assembleHead();
        builder.assembleFireArms();

        Robot sofia = builder.build();
    }
}
