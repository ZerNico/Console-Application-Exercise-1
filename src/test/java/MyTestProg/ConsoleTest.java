package MyTestProg;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class ConsoleTest {

    @Test
    public void testReadInt() {
        Console console = new Console();

        String input = "1";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        int integer = console.readIntegerFromStdin("");

        Assert.assertEquals(integer, Integer.parseInt(input));
    }

    @Test
    public void testReadString() {
        Console console = new Console();

        String input = "a";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        String string = console.readStringFromStdin("");

        Assert.assertEquals(string, input);
    }
}
