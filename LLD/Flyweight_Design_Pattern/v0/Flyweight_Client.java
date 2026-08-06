package v0;

import java.util.ArrayList;

public class Flyweight_Client {

    public static void main(String[] args) {

        ArrayList<Bullet> bullets=new ArrayList<Bullet>();
        for(int i=0;i<2000;i++){
            Bullet bullet= new Bullet();
            bullet.setImage(new byte[2000]);
            bullets.add(bullet);

        }
    }
}
