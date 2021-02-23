package matematika;

import java.util.Scanner;

public class Multiplication extends Operation {
    public Multiplication(String naziv) {
        super(naziv);
    }

    @Override
    public void execute(Scanner scan) {
        System.out.println("Enther the first number:");
        int no1 = Integer.parseInt(scan.nextLine());
        System.out.println("Enter the second number:");
        int no2 = Integer.parseInt(scan.nextLine());
        System.out.println("The product is: " + (no1 * no2));
    }
}
