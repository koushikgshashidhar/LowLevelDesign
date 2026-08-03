package v7;

public class Sparrow extends Bird implements Flyable {
    FlyHeight flyheight;
    public Sparrow(FlyHeight flyheight) {
        this.birdName = "sparrow";
        this.flyheight = flyheight;
    }

    @Override
    public void fly() {
        flyheight.makefly();
    }

    @Override
    void makeSound() {
        System.out.println(birdName + " says: Chirp!");
    }
}
