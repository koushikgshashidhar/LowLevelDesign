package v5;

import v4.FlyableBird;

public class Peacock extends Bird implements Flyable {

    public Peacock() {
        this.birdName = "peacock";

    }


    @Override
    public void fly() {
        System.out.println(birdName + " is flying high");
    }

    @Override
    void makeSound() {
        System.out.println(birdName + " says: I am a peacock!");
    }
}

