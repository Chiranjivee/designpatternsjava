public class Robot {
    private String arms;
    private String legs;
    private String head;
    private String doors;

    private String wheels;
    private String sensors;
    private String fireArms;

    public String getArms() {
        return this.arms;
    }

    public void setArms(String arms) {
        System.out.println("Setting arms");
        this.arms = arms;
    }
    
    public String getLegs() {
        return this.legs;
    }

    public void setLegs(String legs) {
        System.out.println("Setting legs");
        this.legs = legs;
    }

    public String getHead() {
        return this.legs;
    }

    public void setHead(String head) {
        System.out.println("Setting head");
        this.head = head;
    }

    public String getDoors() {
        return this.doors;
    }

    public void setDoors(String doors) {
        System.out.println("Setting doors");
        this.doors = doors;
    }

    public String getWheels() {
        return this.wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getSensors() {
        return this.sensors;
    }

    public void setSensors(String sensors) {
        this.sensors = sensors;
    }

    public String getFireArms() {
        return this.fireArms;
    }

    public void setFireArms(String fireArms) {
        System.out.println("Setting fire-arms");
        this.fireArms = fireArms;
    }
}