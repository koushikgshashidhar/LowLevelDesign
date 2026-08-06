package v1;


public final class Bullet {

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setBulletType(BulletType bulletType) {
        this.bulletType = bulletType;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    int radius;//4

    BulletType bulletType;//10

    byte[] image;//2KB
    double weight;//8




    public int getRadius() {
        return radius;
    }




    public BulletType getBulletType() {
        return bulletType;
    }





    public byte[] getImage() {
        return image;
    }



    public double getWeight() {
        return weight;
    }



}
