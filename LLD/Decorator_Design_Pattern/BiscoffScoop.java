public class BiscoffScoop implements IceCream {

    IceCream iceCream;

    BiscoffScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        return iceCream.getCost() + 20;
    }

    @Override
    public String getContent() {
        return iceCream.getContent() + " with Biscoff Scoop";
    }
}
