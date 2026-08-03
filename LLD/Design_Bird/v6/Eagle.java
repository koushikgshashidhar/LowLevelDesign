package v6;

public class Eagle extends Bird implements Flyable {
FlyHigh flyHigh = new FlyHigh();
    public Eagle() {
        this.birdName = "eagle";

    }


    @Override
    public void fly() {
        flyHigh.makefly();
    }

    @Override
    void makeSound() {
        System.out.println(birdName + " says: I am an eagle!");
    }
}


