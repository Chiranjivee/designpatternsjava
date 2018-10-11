public abstract class Gun {
    protected Bullet[] bullets;
    protected int capacity;
    private final BulletType bulletType;

    public Gun(int capacity, BulletType type) {
        this.capacity = capacity;
        this.bulletType = type;
    }

    public abstract void shoot();
    public void loadBullets() {
        
    }
}