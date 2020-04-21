package MyTestProg.impl;

import MyTestProg.Console;
import MyTestProg.ICommand;

public class GCDSubItCmd implements ICommand {

    private int euclidSubstractionIterative(int a, int b) {
        if (a == 0) {
            return b;
        } else while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    @Override
    public void execute() {
        Console console = new Console();
        int a = console.readIntegerFromStdin("Enter number for a");
        int b = console.readIntegerFromStdin("Enter number for b");

        int gcd = (this.euclidSubstractionIterative(a, b));
        System.out.println("The Greatest Common Divisor is: " + gcd);
    }

    @Override
    public String toString() {
        return "Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm subtraction";
    }
}
