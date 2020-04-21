package MyTestProg.impl;

import MyTestProg.Console;
import MyTestProg.ICommand;

public class GCDDivRestItCmd implements ICommand {

    private int euclidDivisionRestIterative(int a, int b) {
        int h;
        while (b != 0) {
            h = a % b;
            a = b;
            b = h;
        }
        return a;
    }

    @Override
    public void execute() {
        Console console = new Console();
        int a = console.readIntegerFromStdin("Enter number for a");
        int b = console.readIntegerFromStdin("Enter number for b");

        int gcd = (this.euclidDivisionRestIterative(a, b));
        System.out.println("The Greatest Common Divisor is: " + gcd);
    }

    @Override
    public String toString() {
        return "Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm division rest ";
    }
}
