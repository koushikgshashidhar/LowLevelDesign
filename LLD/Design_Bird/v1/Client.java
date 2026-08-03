package v1;

public class Client {

    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird peacock = new Peacock();
        Bird pigeon = new Pigeon();

        sparrow.fly();
        peacock.fly();
        pigeon.fly();

        sparrow.makeSound();
        peacock.makeSound();
        pigeon.makeSound();
    }


}
