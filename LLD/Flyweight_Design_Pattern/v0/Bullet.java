package v0;


public class Bullet {

    int radius;//4
    double x_cord;//8
    double y_cord;//8
    double z_ord;//8
    BulletType bulletType;//10
    BulletStatus bulletStatus;//10
    double xdirection;//8
    double ydirection;//8
    double zdirection;//8
    double speed;//8
    byte[] image;//2KB
    double weight;//8

    //1 GAME
    //2Kb
    //2000B *100
    //400MB


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getX_cord() {
        return x_cord;
    }

    public void setX_cord(double x_cord) {
        this.x_cord = x_cord;
    }

    public double getY_cord() {
        return y_cord;
    }

    public void setY_cord(double y_cord) {
        this.y_cord = y_cord;
    }

    public double getZ_ord() {
        return z_ord;
    }

    public void setZ_ord(double z_ord) {
        this.z_ord = z_ord;
    }

    public BulletType getBulletType() {
        return bulletType;
    }

    public void setBulletType(BulletType bulletType) {
        this.bulletType = bulletType;
    }

    public BulletStatus getBulletStatus() {
        return bulletStatus;
    }

    public void setBulletStatus(BulletStatus bulletStatus) {
        this.bulletStatus = bulletStatus;
    }

    public double getXdirection() {
        return xdirection;
    }

    public void setXdirection(double xdirection) {
        this.xdirection = xdirection;
    }

    public double getYdirection() {
        return ydirection;
    }

    public void setYdirection(double ydirection) {
        this.ydirection = ydirection;
    }

    public double getZdirection() {
        return zdirection;
    }

    public void setZdirection(double zdirection) {
        this.zdirection = zdirection;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}

/*
reduce memory comsumption
 1. intrinsic and extrinsic var
 intrinsic - remains same
 extrinsic- changes


 */