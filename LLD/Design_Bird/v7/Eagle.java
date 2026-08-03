package v7;

public class Eagle extends Bird implements Flyable {
FlyHeight flyheight;
    public Eagle(FlyHeight flyheight) {
        this.birdName = "eagle";
        this.flyheight = flyheight;
    }


    @Override
    public void fly() {
        flyheight.makefly();
    }

    @Override
    void makeSound() {
        System.out.println(birdName + " says: I am an eagle!");
    }
}


