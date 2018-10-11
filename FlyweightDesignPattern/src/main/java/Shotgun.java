public class Shotgun extends Gun {
    public Shotgun (int capacity, BulletType type) {
        super(capacity, type);
    }

    @Override
    public void shoot() {
        for (int i = 0; i < this.capacity; i++) {
            System.out.println(this.bullets[i].toString());
        }
    }
}
