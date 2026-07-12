package polymorphism;

/*
 * POLYMORPHISM
 * -----------
 * Polymorphism means "many forms".
 * We classify behavior instead of only class type.
 *
 * Main ideas:
 * - method overloading = compile-time polymorphism,
 * - method overriding = runtime polymorphism,
 * - parent reference can point to child object,
 * - instanceof + cast help access child-specific behavior,
 * - diamond problem appears with multiple interfaces/default methods.
 */
public class PolymorphismMain {

    public static void main(String[] args) {
        System.out.println("=== Polymorphism demo ===");

        PayrollPrinter printer = new PayrollPrinter();
        System.out.println("Method overloading example:");
        printer.printBonus("Riya");
        printer.printBonus("Riya", 12000);
        printer.printBonus("Riya", 12000, 5000);

        System.out.println();
        System.out.println("Runtime polymorphism example:");
        Employee employee = new Developer("Asha");
        employee.work();

        employee = new Manager("Kabir");
        employee.work();

        System.out.println();
        System.out.println("Parent reference = new Child object");
        System.out.println("The reference type is Employee, but the actual object type is Developer.");
        if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            manager.plan();
        }

        employee = new Developer("Nina");
        if (employee instanceof Developer) {
            Developer developer = (Developer) employee;
            developer.debug();
        }

        System.out.println();
        System.out.println("Diamond problem example using interfaces with same default method:");
        DiamondPrinter diamondPrinter = new DiamondPrinter();
        diamondPrinter.render();
    }
}

// Same method name, different parameter list => overloading.
// Return type alone cannot distinguish overloads.
class PayrollPrinter {
    void printBonus(String employeeName) {
        System.out.println(employeeName + " -> bonus details are not provided");
    }

    void printBonus(String employeeName, int monthlySalary) {
        System.out.println(employeeName + " -> monthly salary = " + monthlySalary);
    }

    void printBonus(String employeeName, int monthlySalary, int bonus) {
        System.out.println(employeeName + " -> monthly salary = " + monthlySalary + ", bonus = " + bonus);
    }
}

abstract class Employee {
    protected final String name;

    Employee(String name) {
        this.name = name;
    }

    abstract void work();
}

class Developer extends Employee {
    Developer(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " writes code and fixes bugs.");
    }

    void debug() {
        System.out.println(name + " is debugging a runtime issue.");
    }
}

class Manager extends Employee {
    Manager(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " plans work and coordinates the team.");
    }

    void plan() {
        System.out.println(name + " is creating a delivery plan.");
    }
}

interface LeftBadge {
    default void render() {
        System.out.println("LeftBadge render");
    }
}

interface RightBadge {
    default void render() {
        System.out.println("RightBadge render");
    }
}

// If two interfaces provide the same default method, the class must resolve it.
class DiamondPrinter implements LeftBadge, RightBadge {
    @Override
    public void render() {
        System.out.println("Diamond problem resolved by overriding render().");
        LeftBadge.super.render();
        RightBadge.super.render();
    }
}

