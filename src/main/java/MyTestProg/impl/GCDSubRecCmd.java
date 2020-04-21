package MyTestProg.impl;

import MyTestProg.Console;
import MyTestProg.ICommand;

public class GCDSubRecCmd implements ICommand {

    private int euclidSubstractionIterative(int a, int b) {
        if (b == 0) {
            return a;
        } else if (a == 0) {
            return b;
        } else if (a > b) {
            return euclidSubstractionIterative(a - b, b);
        } else {
            return euclidSubstractionIterative(a, b - a);
        }
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
        return "Greatest Common Divisor (GCD) - (Recursive) Euclid's algorithm subtraction";
    }
}
