public class HumonoidRobotBuilder implements RobotBuilder {

    private Robot robot;

    public HumonoidRobotBuilder() { }

    @Override
    public void initBot() {
        this.robot = new Robot();
    }

    @Override
    public void assembleArms() {
        this.robot.setArms("Setting arms");
    }

    @Override
    public void assembleLegs() {
        this.robot.setLegs("Setting legs");
    }

    @Override
    public void assembleWheels() {
        this.robot.setWheels("Wheels not required");
    }

    @Override
    public void assembleHead() {
        this.robot.setHead("Setting head.");
    }

    @Override
    public void assembleFireArms() {
        this.robot.setFireArms("Setting fire-arms.");
    }

    @Override
    public void assembleSensors() {
        this.robot.setSensors("Setting sensors.");
    }

    @Override
    public void assembleDoors() {
        this.robot.setDoors("Setting doors.");
    }

    @Override
    public Robot build() {
        return this.robot;
    }
}
