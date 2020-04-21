package MyTestProg.impl;

import MyTestProg.Console;
import MyTestProg.ICommand;

public class GCDDivRestRecCmd implements ICommand {

    private int euclidDivisionRestRecursive(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return euclidDivisionRestRecursive(b, a % b);
        }
    }

    @Override
    public void execute() {
        Console console = new Console();
        int a = console.readIntegerFromStdin("Enter number for a");
        int b = console.readIntegerFromStdin("Enter number for b");

        int gcd = (this.euclidDivisionRestRecursive(a, b));
        System.out.println("The Greatest Common Divisor is: " + gcd);
    }

    @Override
    public String toString() {
        return "Greatest Common Divisor (GCD) - (Recursive) Euclid's algorithm division rest";
    }
}
