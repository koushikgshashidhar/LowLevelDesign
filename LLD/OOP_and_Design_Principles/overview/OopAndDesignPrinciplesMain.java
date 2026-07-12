 package overview;

/*
 * This is the single entry point that runs all the concept demos in order.
 * Run this class if you want the full walkthrough:
 * - procedural programming
 * - encapsulation
 * - object creation
 * - inheritance
 * - polymorphism
 * - abstraction
 */
public class OopAndDesignPrinciplesMain {

    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("OOP and Design Principles - complete walkthrough");
        System.out.println("============================================================");
        System.out.println();

        procedural.ProceduralProgrammingDemo.main(args);
        System.out.println();

        encapsulation.EncapsulationMain.main(args);
        System.out.println();

        objectcreation.OopAndDesignPrinciplesMain.main(args);
        System.out.println();

        inheritance.OopAndDesignPrinciplesMain.main(args);
        System.out.println();

        polymorphism.PolymorphismMain.main(args);
        System.out.println();

        abstraction.AbstractionMain.main(args);
    }
}

