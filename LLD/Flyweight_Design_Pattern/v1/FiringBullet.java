package v1;
//static
public class FiringBullet {

    double x_cord;//8
    double y_cord;//8
    double z_ord;//8
    BulletStatus bulletStatus;//10
    double xdirection;//8
    double ydirection;//8
    double zdirection;//8
    double speed;//8
    Bullet bullet;//10
    //100B
    //2000B *100
    //2kb*100*100
    //20MB


    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }
    public double getXdirection() {
        return xdirection;
    }

    public void setXdirection(double xdirection) {
        this.xdirection = xdirection;
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

    public BulletStatus getBulletStatus() {
        return bulletStatus;
    }

    public void setBulletStatus(BulletStatus bulletStatus) {
        this.bulletStatus = bulletStatus;
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






}
