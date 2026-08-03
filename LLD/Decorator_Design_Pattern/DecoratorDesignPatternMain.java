public class DecoratorDesignPatternMain {
    public static void main(String[] args) {

        System.out.println("Decorator Design Pattern module is ready.");

        IceCream iceCream1 = new VanilaScoop(new ChocolateScoop(new BiscoffScoop(new OrangeCone())));
        System.out.println(iceCream1.getContent() + " costs $" + iceCream1.getCost());

       // not possible IceCream iceCream2 = new ChocolateScoop();

    }
}

/*
based on input , one can decorate
its wrapping

if u observe , we can categorize on
base entities - cone where there are no constructor
decorate entities - which has constructor with dependencies
you can also more validation


 */