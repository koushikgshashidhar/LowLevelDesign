public class VanilaScoop implements IceCream {

    IceCream iceCream;

    VanilaScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        return iceCream.getCost() + 10;
    }

    @Override
    public String getContent() {
        return iceCream.getContent() + " with Vanila Scoop";
    }
}
