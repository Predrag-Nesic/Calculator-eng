package matematika;

import java.util.Scanner;

public class Addition extends Operation {
    public Addition(String name) {
        super(name);
    }

    @Override
    public void execute(Scanner scan) {
        System.out.println("Enther the first number:");
        int no1 = Integer.parseInt(scan.nextLine());
        System.out.println("Enter the second number:");
        int no2 = Integer.parseInt(scan.nextLine());
        System.out.println("The sum is: " + (no1 + no2));
    }
}
