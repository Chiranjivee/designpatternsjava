public abstract class Gun {
    protected Bullet[] bullets;
    protected int capacity;
    protected final BulletType bulletType;

    public Gun(int capacity, BulletType type) {
        this.capacity = capacity;
        this.bulletType = type;
        this.bullets = new Bullet[capacity];
    }

    public abstract void shoot();

    public abstract void loadBullets();

    public abstract void loadUncachedBullets();
}