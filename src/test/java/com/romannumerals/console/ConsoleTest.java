package com.romannumerals.console;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import java.io.InputStream;
import java.io.PrintStream;


public class ConsoleTest {


    @Test
    public void checkConvertNumeral(){
        InputStream stdin = System.in;
        PrintStream stdout = System.out;

        System.setIn(new ByteArrayInputStream("3\n4\n".getBytes()));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);

        System.setOut(ps);

        Console.main(new String[0]);

        System.setIn(stdin);
        System.setOut(stdout);

        String outputText = byteArrayOutputStream.toString();
        String key = "output:";
        String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();

        System.out.println(output);
        System.out.println(outputText);

        Assertions.assertEquals("7", output);
    }
}
/*
    @Test
    public void shouldTakeUserInput() {
        /*
        //create a mock scanner
        Scanner mockScanner = mock(Scanner.class);
        //set up the scanner
        when(mockScanner.nextLine()).thenReturn("add 5");
        Console inputOutput= new Console(mockScanner);
        InputStream stdin = System.in;
        Scanner scanner = new Scanner(stdin);
        Console inputOutput= new Console(scanner);
        System.setIn(stdin);
        Assertions.assertEquals("add 5", inputOutput.getInput());
}
}
*/
