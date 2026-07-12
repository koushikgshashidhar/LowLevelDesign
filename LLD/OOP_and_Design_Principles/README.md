# OOP and Design Principles

This folder contains small Java demos for learning OOP and design-principle basics step by step.

## Topics covered
- procedural programming vs OOP
- encapsulation
- object creation, constructors, copy constructor, `this`
- inheritance and constructor chaining
- polymorphism, overloading, overriding, `instanceof`
- abstraction with abstract classes and interfaces

## Run the full walkthrough
From `D:\Tech\LowLevelDesign\LowLevelDesign\LLD\OOP_and_Design_Principles`:

```powershell
javac (Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName })
java overview.OopAndDesignPrinciplesMain
```

## Run a single topic
Examples:

```powershell
java procedural.ProceduralProgrammingMain
java encapsulation.EncapsulationMain
java objectcreation.OopAndDesignPrinciplesMain
java inheritance.OopAndDesignPrinciplesMain
java polymorphism.PolymorphismMain
java abstraction.AbstractionMain
```

