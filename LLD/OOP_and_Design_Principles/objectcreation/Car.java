package objectcreation;

// Real-world example for object creation, constructors, `this`, and copy constructor.
public class Car {

    private String brand;
    private String model;
    private int year;
    private Engine engine;

    // Default constructor.
    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.engine = new Engine();
        System.out.println("Car default constructor called");
    }

    // Parameterized constructor.
    public Car(String brand, String model, int year, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = engine;
        System.out.println("Car parameterized constructor called");
    }

    // Copy constructor -> shallow copy.
    public Car(Car other) {
        this.brand = other.brand;
        this.model = other.model;
        this.year = other.year;
        this.engine = other.engine;
        System.out.println("Car copy constructor called");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{brand='" + brand + "', model='" + model + "', year=" + year + ", engine=" + engine + "}";
    }
}

