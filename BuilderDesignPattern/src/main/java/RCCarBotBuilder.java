public class RCCarBotBuilder implements RobotBuilder {

    private Robot robot;

    public RCCarBotBuilder() {
        
    }

    @Override
    public void initBot() {
        this.robot = new Robot();
    }

    @Override
    public void assembleArms() {
        this.robot.setArms("No arms for rc bot required...");
    }

    @Override
    public void assembleLegs() {
        this.robot.setLegs("No legs for rc bot required...");
    }

    @Override
    public void assembleWheels() {
        this.robot.setWheels("Assembling wheels...");
    }

    @Override
    public void assembleHead() {
        this.robot.setHead("No head required for rc bot...");
    }

    @Override
    public void assembleFireArms() {
        this.robot.setFireArms("Setting firearms...");
    }

    @Override
    public void assembleSensors() {
        this.robot.setSensors("Setting sensors...");
    }

    @Override
    public void assembleDoors() {
        this.robot.setDoors("Setting doors...");
    }

    @Override
    public Robot build() {
        return this.robot;
    }
}
