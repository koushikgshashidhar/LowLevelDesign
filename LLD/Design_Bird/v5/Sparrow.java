package v5;

import v4.FlyableBird;

public class Sparrow extends Bird implements Flyable {

    public Sparrow() {
        this.birdName = "sparrow";

    }


    @Override
    public void fly() {
        System.out.println(birdName + " is flying low.");
    }

    @Override
    void makeSound() {
        System.out.println(birdName + " says: Chirp!");
    }
}
