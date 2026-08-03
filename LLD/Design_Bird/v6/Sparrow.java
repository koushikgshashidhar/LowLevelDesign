package v6;

public class Sparrow extends Bird implements Flyable {
    FlyLow flyLow = new FlyLow();
    public Sparrow() {
        this.birdName = "sparrow";

    }

    @Override
    public void fly() {
        flyLow.makefly();
    }

    @Override
    void makeSound() {
        System.out.println(birdName + " says: Chirp!");
    }
}
