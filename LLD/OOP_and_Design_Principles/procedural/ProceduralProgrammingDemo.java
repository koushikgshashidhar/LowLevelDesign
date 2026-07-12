package procedural;

/*
 * PROCEDURAL PROGRAMMING
 * ----------------------
 * 1) A procedure is a named block of steps.
 * 2) A method/function is a procedure attached to a class in Java.
 * 3) Procedural programming keeps data and procedures separate.
 * 4) In large real-world systems, that becomes harder to manage because the
 *    action happens outside the entity.
 * 5) In OOP, the entity owns its data and behavior.
 */
public class ProceduralProgrammingDemo {

    // This class behaves like a struct: it only stores data.
    // In procedural programming, the function will operate on this data.
    static class EmployeeStruct {
        int id;
        String name;
        double salary;
    }

    // A procedure: a reusable set of steps.
    // The procedure takes an entity and changes it.
    static void increaseSalary(EmployeeStruct employee, double percent) {
        double increment = employee.salary * percent / 100.0;
        employee.salary = employee.salary + increment;
    }

    static void printEmployee(EmployeeStruct employee) {
        System.out.println("EmployeeStruct { id=" + employee.id
                + ", name='" + employee.name + "'"
                + ", salary=" + employee.salary + " }");
    }

    public static void main(String[] args) {
        System.out.println("=== Procedural programming demo ===");
        System.out.println("A procedure/function/method is a reusable sequence of steps.");
        System.out.println("Procedural style keeps the entity as data and the action in a separate function.");
        System.out.println();

        EmployeeStruct employee = new EmployeeStruct();
        employee.id = 101;
        employee.name = "Asha";
        employee.salary = 50000;

        System.out.println("Before calling procedure:");
        printEmployee(employee);

        System.out.println();
        double incrementPercent = 10 + (employee.id % 3);
        System.out.println("Calling procedure increaseSalary(employee, " + incrementPercent + ")");
        increaseSalary(employee, incrementPercent);

        System.out.println("After calling procedure:");
        printEmployee(employee);

        System.out.println();
        System.out.println("Why procedural programming becomes less relevant for complex systems:");
        System.out.println("- The business rules are scattered across many procedures.");
        System.out.println("- The same entity is modified by many unrelated functions.");
        System.out.println("- Real-world systems are easier to model when entities control their own behavior.");
    }
}


