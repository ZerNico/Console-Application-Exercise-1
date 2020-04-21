package MyTestProg;

import java.util.LinkedList;

public class MainApp {
    public static void main(String[] args) {
        CommandFactory cmdFactory = new CommandFactory();
        Console console = new Console();

        // create a list of all commands
        LinkedList<ICommand> commands = new LinkedList<>();
        commands.add(cmdFactory.createGCDSubRecCmd());
        commands.add(cmdFactory.createGCDSubItCmd());
        commands.add(cmdFactory.createGCDDivRestRecCmd());
        commands.add(cmdFactory.createGCDDivRestItCmd());
        commands.add(cmdFactory.createPSieveEraCmd());

        // display all available commands in console
        System.out.println("Console-Application: Exercise-1\n");
        int pos = 1;
        for (ICommand command: commands) {
            System.out.print(pos + ". ");
            System.out.println(command);
            pos++;
        }
        System.out.println("0. Exit\n");

        // let user select a command
        int i = console.readIntegerFromStdin("Please enter a number for an option");
        if (i == 0 || i > commands.size()) {
            System.exit(0);
        }
        System.out.println();
        ICommand command = commands.get(i - 1);
        System.out.println(command);
        // execute chosen command
        command.execute();
    }
}
