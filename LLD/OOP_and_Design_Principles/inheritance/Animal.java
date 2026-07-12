package inheritance;

// Real-world parent entity for the inheritance example.
// `Animal` is an abstraction of common properties shared by all animals.
public abstract class Animal {

    // Encapsulated state: outside code must use getters/setters.
    private String name;
    private int age;

    public Animal() {
        this("Unknown", 0);
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Shared behavior that children may override.
    public void eat() {
        System.out.println(name + " is eating food.");
    }

    // Every animal can make a sound, but each animal does it differently.
    public abstract void sound();
}

