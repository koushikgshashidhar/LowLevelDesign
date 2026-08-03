package v7;

public class Peacock extends Bird implements Flyable {
FlyHigh flyHigh= new FlyHigh();
    public Peacock() {
        this.birdName = "peacock";

    }


    @Override
    public void fly() {
        flyHigh.makefly();
    }

    @Override
    void makeSound() {
        System.out.println(birdName + " says: I am a peacock!");
    }
}

