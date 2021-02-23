package matematika;

import java.util.Scanner;

public abstract class Operation {
    protected String name;

    public Operation(String name) {
        this.name = name;
    }

    public String getNaziv() {
        return name;
    }

    public abstract void execute(Scanner scan);
}
