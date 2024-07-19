package e46Test;

import org.example.e46.E46WhileLoop;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E46WhileLoopTester {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testWhileLoop() {
        E46WhileLoop.main(new String[]{});
        String expectedOutput = "0" + System.lineSeparator() +
                                "1" + System.lineSeparator() +
                                "2" + System.lineSeparator() +
                                "3" + System.lineSeparator() +
                                "4" + System.lineSeparator() +
                                "5" + System.lineSeparator() +
                                "6" + System.lineSeparator() +
                                "7" + System.lineSeparator() +
                                "8" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the while loop.\n" +
                "Please ensure that your program correctly uses the while loop to print numbers from 0 to 8.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
