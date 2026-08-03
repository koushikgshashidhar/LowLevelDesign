package v5;


public class Pigeon extends Bird implements Flyable {
    public Pigeon() {
        this.birdName = "Pigeon";

    }

    @Override
    public void fly() {
        System.out.println(birdName + " is flying low.");
    }

    @Override
    void makeSound() {
        System.out.println(birdName + " says: Coo!");
    }
}




