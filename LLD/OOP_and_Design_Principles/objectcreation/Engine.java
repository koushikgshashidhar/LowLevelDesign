package objectcreation;

// A real-world helper object used by Car.
// It lets us demonstrate shallow copy: two cars can share the same Engine reference.
public class Engine {
    int horsepower;

    public Engine() {
        this(0);
    }

    public Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "Engine{horsepower=" + horsepower + "}";
    }
}

