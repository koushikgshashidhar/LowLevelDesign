package v7;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        FlyHeight flyLow = new FlyLow();
        FlyHeight flyHigh = new FlyHigh();

        Bird sparrow = new Sparrow(flyLow);
        Bird eagle = new Eagle(flyHigh);
        Bird peacock = new Peacock();
        Bird pigeon = new Pigeon();
        Bird Penguin = new Penguin();






    }


}

