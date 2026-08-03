package v2;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird peacock = new Peacock();
        Bird pigeon = new Pigeon();
        Bird Penguin = new Penguin();

        List<Bird> birds = List.of(sparrow,peacock,pigeon,Penguin);

        for(Bird b: birds)
        {

            b.fly();
            b.makeSound();
        }
    }


}

//Penguin is forced to implement the fly