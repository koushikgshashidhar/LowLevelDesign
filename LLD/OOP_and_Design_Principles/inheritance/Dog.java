package inheritance;

// Real-world child entity for the inheritance example.
// Dog is a type of Animal -> is-a relationship.
public class Dog extends Animal {

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
        System.out.println("Dog constructor");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void sound() {
        System.out.println(getName() + " says: Woof!");
    }

    public void wagTail() {
        System.out.println(getName() + " is wagging its tail.");
    }
}

