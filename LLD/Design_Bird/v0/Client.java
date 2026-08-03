package v0;

public class Client {

    public static void main(String[] args) {
        Bird sparrow = new Bird("sparrow");
        sparrow.fly();
        sparrow.makeSound();

        Bird peacock = new Bird("peacock");
        peacock.fly();
        peacock.makeSound();

        Bird pigeon = new Bird("pigeon");
        pigeon.fly();
        pigeon.makeSound();
    }
}

// Single responsibility and open closed principle is breaking