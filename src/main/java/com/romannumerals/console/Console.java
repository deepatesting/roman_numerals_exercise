package com.romannumerals.console;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Console {

    private Scanner scanner;
    private PrintStream printStream;
    private LinkedHashMap<String, Integer> romanToNumberMap = new LinkedHashMap<>();

    public Console(InputStream inputStream, PrintStream printStream) {
        this.scanner = new Scanner(inputStream);
        this.printStream = printStream;

        this.romanToNumberMap.put("I", 1);
        this.romanToNumberMap.put("II", 2);
        this.romanToNumberMap.put("III", 3);
        this.romanToNumberMap.put("IV", 4);
        this.romanToNumberMap.put("V", 5);
        this.romanToNumberMap.put("VI", 6);
        this.romanToNumberMap.put("VII", 7);
        this.romanToNumberMap.put("VIII", 8);
        this.romanToNumberMap.put("IX", 9);
        this.romanToNumberMap.put("X", 10);

    }

   public void convertNumeral() {
        String numberToString = "";

        printStream.println("Please enter roman number from 1 to 10:");
        String romanNumeral = scanner.nextLine();

        if (this.romanToNumberMap.containsKey(romanNumeral)) {
            numberToString = this.romanToNumberMap.get(romanNumeral).toString();
            printStream.println("You converted the Roman Numeral " + romanNumeral +  " to the number: " + numberToString);
        }
        else {
            printStream.println("You entered invalid Roman Numeral: " + romanNumeral);
        }
    }

    public static void main(String[] args) {
        Console userInputExample = new Console(System.in, System.out);
        userInputExample.convertNumeral();
    }
}
