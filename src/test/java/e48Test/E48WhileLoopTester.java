package e48Test;

import org.example.e48.E48WhileLoop;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E48WhileLoopTester {

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
        E48WhileLoop.main(new String[]{});
        String expectedOutput = "2" + System.lineSeparator() +
                                "4" + System.lineSeparator() +
                                "6" + System.lineSeparator() +
                                "8" + System.lineSeparator() +
                                "10" + System.lineSeparator() +
                                "12" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for the while loop.\n" +
                "Please ensure that your program correctly uses the while loop to print even numbers from 1 to 13.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
