package v4;

public class Penguin extends NonFlyableBird {

    public Penguin() {
        this.birdName = "penguin";
    }

//    @Override
//    void fly() {
//        System.out.println(birdName + " cannot fly.");
//    }

//    @Override
//    void fly() {
//       //do nothing
//    }


//    @Override
//    void fly() throws Exception{
//       throw new Exception("Cant fly");
//    }

    @Override
    void makeSound() {
        System.out.println(birdName + " says: I am a penguin!");
    }
}


