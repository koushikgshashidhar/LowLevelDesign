package v6;


public class Pigeon extends Bird implements Flyable {

    FlyLow flyLow = new FlyLow();
    public Pigeon() {
        this.birdName = "Pigeon";

    }

    @Override
    public void fly() {
        flyLow.makefly();
    }

    @Override
    void makeSound() {
        System.out.println(birdName + " says: Coo!");
    }
}




