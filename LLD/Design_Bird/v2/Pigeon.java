package v2;

public class Pigeon extends Bird {
    public Pigeon() {
        this.birdName = "Pigeon";

    }

    @Override
    void fly() {
        System.out.println(birdName + " is flying.");
    }

    @Override
    void makeSound() {
        System.out.println(birdName + " says: Coo!");
    }
}
