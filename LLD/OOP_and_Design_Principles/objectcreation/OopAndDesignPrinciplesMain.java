package objectcreation;

public class OopAndDesignPrinciplesMain {
    public static void main(String[] args) {
        System.out.println("=== Object creation demo ===");
        System.out.println("A class is a blueprint. An object is an instance created from it.");
        System.out.println();

        System.out.println("Real-world example: Car and Engine");

        System.out.println("Step 1: create a car with the default constructor");
        Car defaultCar = new Car();
        System.out.println(defaultCar);

        System.out.println();
        System.out.println("Step 2: create a car with the parameterized constructor");
        Engine engine = new Engine(120);
        Car parameterizedCar = new Car("Toyota", "Corolla", 2024, engine);
        System.out.println(parameterizedCar);

        System.out.println();
        System.out.println("Step 3: create a copy using the copy constructor");
        Car copiedCar = new Car(parameterizedCar);
        System.out.println(copiedCar);
        System.out.println("copiedCar.getEngine() == parameterizedCar.getEngine() ? " + (copiedCar.getEngine() == parameterizedCar.getEngine()));
        System.out.println("That true result shows a shallow copy: both cars share the same Engine reference.");

        System.out.println();
        System.out.println("Important rules about constructors:");
        System.out.println("- Constructors do not return a value.");
        System.out.println("- Constructors can initialize fields.");
        System.out.println("- `this` refers to the current object.");
    }
}





