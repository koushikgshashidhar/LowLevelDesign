# LowLevelDesign

This repository contains a basic Java 17 application under the `LLD` folder.
Each topic has its own folder and one runnable `main` class.

## Compile (Java 17)

```bash
cd /home/runner/work/LowLevelDesign/LowLevelDesign
javac --release 17 $(find LLD -name "*.java")
```

## Run an example

```bash
cd /home/runner/work/LowLevelDesign/LowLevelDesign
java -cp LLD/Singleton_Design_Pattern SingletonDesignPatternMain
```
