package v2;

public class Sparrow extends Bird {

    public Sparrow() {
        this.birdName = "sparrow";

    }

    @Override
    void fly() {
        System.out.println(birdName + " is flying.");
    }

    @Override
    void makeSound() {
        System.out.println(birdName + " says: Chirp!");
    }
}
