package v2;

public class Peacock extends Bird {

    public Peacock() {
        this.birdName = "peacock";

    }

    @Override
    void fly() {

        System.out.println(birdName + " is flying.");
    }

    @Override
    void makeSound() {
        System.out.println(birdName + " says: I am a peacock!");
    }
}

