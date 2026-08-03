package v4;

public class Sparrow extends FlyableBird {

    public Sparrow() {
        this.birdName = "sparrow";

    }


    void fly() {
        System.out.println(birdName + " is flying.");
    }

    @Override
    void makeSound() {
        System.out.println(birdName + " says: Chirp!");
    }
}
