package com.romannumerals.console;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import java.io.InputStream;
import java.io.PrintStream;


public class ConsoleTest {

    private final InputStream stdin = System.in;
    private final PrintStream stdout = System.out;

    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(byteArrayOutputStream);


    @Test
    public void checkConvertNumeralForOne(){

        System.setIn(new ByteArrayInputStream("II\n".getBytes()));
        System.setOut(ps);

        Console.main(new String[0]);

        String outputText = byteArrayOutputStream.toString();
        String key = "number:";
        String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();

        System.setIn(stdin);
        System.setOut(stdout);

        Assertions.assertEquals("2", output);
    }

    @Test
    public void checkConvertNumeralForInvalid() {

        System.setIn(new ByteArrayInputStream("XV\n".getBytes()));
        System.setOut(ps);

        Console.main(new String[0]);

        String outputText = byteArrayOutputStream.toString();

        System.setIn(stdin);
        System.setOut(stdout);

        Assertions.assertTrue(outputText.contains("You entered invalid Roman Numeral: XV"));

    }

}

