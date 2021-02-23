package matematika;

import java.util.Scanner;

public class Division extends Operation {
    public Division(String name) {
        super(name);
    }

    @Override
    public void execute(Scanner scan) {
        System.out.println("Enther the first number:");
        int no1 = Integer.parseInt(scan.nextLine());
        System.out.println("Enter the second number:");
        int no2 = Integer.parseInt(scan.nextLine());
        System.out.println("The quotient is: " + (no1 / no2));
    }
}
