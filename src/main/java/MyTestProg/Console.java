package MyTestProg;

import java.util.Scanner;

public class Console {
    public int readIntegerFromStdin(String text) {
        // Create scanner for later use
        Scanner s = new Scanner(System.in);

        int integer;

        // ask for int till proper int was input
        while (true) {
            try {
                System.out.print(text + ": ");
                integer = s.nextInt();
                break;
            } catch (Exception e) {
                s.next();
            }
        }
        return integer;
    }

    public String readStringFromStdin(String text) {
        // Create scanner for later use
        Scanner s = new Scanner(System.in);

        String string;

        // ask for int till proper string was input
        while (true) {
            try {
                System.out.print(text + ": ");
                string = s.nextLine();
                // don't allow empty string
                if (!string.equals("")) break;
            } catch (Exception e) {
                s.next();
            }
        }
        return string;
    }
}
