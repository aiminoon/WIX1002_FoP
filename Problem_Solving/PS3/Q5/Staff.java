package PS3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Staff {
    protected final String name;
    protected final String ic;

    @Override
    public String toString() {
        return """
            Name: %s
            IC: %s""".formatted(name, ic);
    }

    public abstract double getSalary();
}
