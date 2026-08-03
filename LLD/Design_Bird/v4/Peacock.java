package v4;

public class Peacock extends FlyableBird{

    public Peacock() {
        this.birdName = "peacock";

    }


    void fly() {

        System.out.println(birdName + " is flying.");
    }

    @Override
    void makeSound() {
        System.out.println(birdName + " says: I am a peacock!");
    }
}

