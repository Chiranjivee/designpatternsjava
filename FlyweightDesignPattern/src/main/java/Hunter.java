public class Hunter {
    public static void main(String[] args) {
        System.out.println("Shooting with cached bullets");
        Gun shotGun = new Shotgun(8, BulletType.SHOTGUN_BULLET);
        shotGun.loadBullets();
        shotGun.shoot();

        System.out.println("Shooting with un-cached bullets");
        Gun shotgunUncached = new Shotgun(8, BulletType.SHOTGUN_BULLET);
        shotgunUncached.loadUncachedBullets();
        shotgunUncached.shoot();
    }
}