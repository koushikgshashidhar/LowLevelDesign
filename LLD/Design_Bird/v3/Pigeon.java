package v3;

public class Pigeon extends Bird {
    public Pigeon() {
        this.birdName = "Pigeon";

    }


    void fly() {
        System.out.println(birdName + " is flying.");
    }

    @Override
    void makeSound() {
        System.out.println(birdName + " says: Coo!");
    }
}
