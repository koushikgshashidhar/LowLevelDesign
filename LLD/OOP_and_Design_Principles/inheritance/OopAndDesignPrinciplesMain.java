package inheritance;

// This file focuses on inheritance, access modifiers, constructor chaining,
// and parent/child polymorphism.

class Parent {
    Parent() {
        init();
    }
    void init() { System.out.println("Parent init"); }
}
class Child extends Parent {
    int value = 10;

    @Override
    void init() {
        System.out.println("Child init, value=" + value);
    }
}



public class OopAndDesignPrinciplesMain {
    public static void main(String[] args) {
        System.out.println("=== Inheritance and polymorphism demo ===");

        System.out.println("Step 1: constructor chaining and dynamic dispatch during construction");
        new Child();
        System.out.println("Notice how Parent() calls init(), but Child.init() runs because the actual object is Child.");

        System.out.println();
        System.out.println("Step 2: real-world inheritance with Animal -> Dog");

        Animal animal = new Dog("Buddy", 3, "Golden Retriever");
        System.out.println("Parent reference points to child object: Animal animal = new Dog(...)");
        System.out.println("animal.getName() = " + animal.getName());
        System.out.println("animal.getAge() = " + animal.getAge());

        System.out.println();
        System.out.println("Step 3: parent reference sees only parent behavior");
        animal.eat();
        animal.sound();
        System.out.println("animal can only call what Animal promises in its contract.");

        Dog dog = new Dog("Max", 5, "Beagle");
        System.out.println("Child reference can access child behavior and child data.");
        System.out.println("dog.getBreed() = " + dog.getBreed());
        dog.wagTail();

        System.out.println();
        System.out.println("Step 4: instanceof + cast when you need child-only behavior");
        if (animal instanceof Dog dogFromAnimal) {
            System.out.println("Downcast succeeded because the real object is a Dog.");
            System.out.println("breed = " + dogFromAnimal.getBreed());
            dogFromAnimal.wagTail();
        }

        System.out.println();
        System.out.println("Access modifier reminders:");
        System.out.println("- public: accessible anywhere");
        System.out.println("- protected: package + child classes");
        System.out.println("- default: package only");
        System.out.println("- private: only inside the class");
    }
}


/*
X   default m()
Y   default m()

Z X Y
z.X.m()




*/

/*

Employee


fte
contr
dir
vp
 */

/*

what is procedure?method/function

what is procedural programming?procedures

what is entity in procedural?primitive,struct

why procedural programming is not relevant? large system, real world and Action happens on entities

oop- Entities perfoming actions, Entities have control on there behaviour



Employee
primitive,struct

class

increraseSalary(Employee e)
{
e.salry++;

}

1 principle -abstraction

3 pillars -poly,encap,inheritance

Encapsultion ex :capsule - hold together,protect,better experience
access modifiers-

public
protected
default
private


Inhertiance:
extends














 */
