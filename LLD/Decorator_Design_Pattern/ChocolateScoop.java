public class ChocolateScoop implements IceCream {

    IceCream iceCream;

    ChocolateScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        return iceCream.getCost() + 15;
    }

    @Override
    public String getContent() {
        return iceCream.getContent() + " with Chocolate Scoop";
    }
}
