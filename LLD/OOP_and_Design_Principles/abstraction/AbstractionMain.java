package abstraction;

/*
 * ABSTRACTION
 * ----------
 * Abstraction means representing a complex system in terms of ideas/entities.
 * We focus on the target or the "what", not the internal "how".
 *
 * In practice:
 * - abstract class represents a partial idea,
 * - interface represents a pure behavior contract,
 * - class is used to hold data and behavior together.
 */
public class AbstractionMain {

    public static void main(String[] args) {
        System.out.println("=== Abstraction demo ===");
        System.out.println("We work with Shape and Notifier as ideas/abstractions.");
        System.out.println();

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        printShape(circle);
        printShape(rectangle);

        System.out.println();
        Notifier notifier = new EmailNotifier("design-principles@example.com");
        notifier.send("Abstraction hides internal details and exposes only the required behavior.");
    }

    private static void printShape(Shape shape) {
        System.out.println("----------------------------------------");
        System.out.println(shape.describe());
        System.out.println("Area = " + shape.area());
    }
}

interface Notifier {
    void send(String message);
}

abstract class Shape {
    private final String name;

    Shape(String name) {
        // Even abstract classes can have constructors.
        // Child classes call this using super(...).
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String describe() {
        return "Shape name: " + name;
    }

    // A child class must provide the implementation.
    abstract double area();
}

class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private final double length;
    private final double width;

    Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

class EmailNotifier implements Notifier {
    private final String email;

    EmailNotifier(String email) {
        this.email = email;
    }

    @Override
    public void send(String message) {
        System.out.println("Sending email to " + email);
        System.out.println("Message: " + message);
    }
}

