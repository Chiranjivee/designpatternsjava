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

    @Override
    public void loadBullets() {
        for (int i = 0; i < this.bullets.length; i++) {
            bullets[i] = BulletFactory.getBulletByType(this.bulletType);
        }
    }

    @Override
    public void loadUncachedBullets() {
        for (int i = 0; i < this.bullets.length; i++) {
            bullets[i] = BulletFactory.getBulletFromCache(this.bulletType);
        }
    }
}
