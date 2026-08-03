package v1;

public class Sparrow extends Bird {

    public Sparrow() {
        this.birdName = "sparrow";

    }

    @Override
    void fly() {
        System.out.println(birdName + " is flying.");
    }

    @Override
    void makeSound() {
        System.out.println(birdName + " says: Chirp!");
    }
}

//what if Penguin is introduced