package v5;

public class Eagle extends Bird implements Flyable {

    public Eagle() {
        this.birdName = "eagle";

    }


    @Override
    public void fly() {
        System.out.println(birdName + " is flying high.");
    }

    @Override
    void makeSound() {
        System.out.println(birdName + " says: I am an eagle!");
    }
}


