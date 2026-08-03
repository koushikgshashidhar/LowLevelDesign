package v5;

import v4.FlyableBird;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird peacock = new Peacock();
        Bird pigeon = new Pigeon();
        Bird Penguin = new Penguin();
        Flyable sparrow1 = new Sparrow();
        Flyable peacock1 = new Peacock();
        Flyable pigeon1 = new Pigeon();

        List<Bird> birds = List.of(sparrow,peacock,pigeon,Penguin);
    List<Flyable> flyableBirds = List.of(sparrow1,peacock1,pigeon1);
        for(Bird b: birds)
        {
            b.makeSound();
        }

        for(Flyable b: flyableBirds)
        {
            b.fly();
        }
    }


}

//code duplication