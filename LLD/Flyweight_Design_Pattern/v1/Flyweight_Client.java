package v1;

import java.util.ArrayList;

public class Flyweight_Client {

    public static void main(String[] args) {


        BulletRegistry bulletRegistry=new BulletRegistry();
        Bullet fiveMMBullet = new Bullet();
        fiveMMBullet.setRadius(5);
        fiveMMBullet.setWeight(10.0);
        bulletRegistry.addBullet(BulletType.FiveMM, fiveMMBullet);

        Bullet sevenMMBullet = new Bullet();
        sevenMMBullet.setRadius(7);
        sevenMMBullet.setWeight(15.0);
        bulletRegistry.addBullet(BulletType.SevenMM, sevenMMBullet);

        ArrayList<FiringBullet> bullets=new ArrayList<FiringBullet>();
        for(int i=0;i<2000;i++){
            FiringBullet firingBullet=new FiringBullet();
            firingBullet.setBullet( bulletRegistry.getBullet(BulletType.FiveMM));
            bullets.add(firingBullet);
        }
    }
}


//
