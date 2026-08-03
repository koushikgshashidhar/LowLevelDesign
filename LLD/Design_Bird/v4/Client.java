package v4;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird peacock = new Peacock();
        Bird pigeon = new Pigeon();
        Bird Penguin = new Penguin();
        FlyableBird sparrow1 = new Sparrow();
        FlyableBird peacock1 = new Peacock();
        FlyableBird pigeon1 = new Pigeon();

        List<Bird> birds = List.of(sparrow,peacock,pigeon,Penguin);
    List<FlyableBird> flyableBirds = List.of(sparrow1,peacock1,pigeon1);
        for(Bird b: birds)
        {
            b.makeSound();
        }

        for(FlyableBird b: flyableBirds)
        {
            b.fly();
        }
    }


}

