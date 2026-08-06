package v1;

import java.util.HashMap;

public class BulletRegistry {

    HashMap<BulletType, Bullet> bulletMap;

    public BulletRegistry() {
        bulletMap = new HashMap<>();
    }

    public Bullet getBullet(BulletType bulletType) {
        return bulletMap.get(bulletType);
    }

    public void addBullet(BulletType bulletType, Bullet bullet) {
        bulletMap.put(bulletType, bullet);
    }
}
