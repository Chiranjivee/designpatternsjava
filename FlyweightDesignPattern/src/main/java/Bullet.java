public final class Bullet {
    private final String bulletSize;
    private final String bulletWeight;

    public Bullet(String size, String weight) {
        this.bulletSize = size;
        this.bulletWeight = weight;
    }

    public String getBulletSize() {
        return this.bulletSize;
    }

    public String getBulletWeight() {
        return this.bulletWeight;
    }
}