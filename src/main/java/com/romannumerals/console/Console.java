package com.romannumerals.console;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Console {

    private Scanner scanner;
    private PrintStream printStream;

    public Console(InputStream inputStream, PrintStream printStream) {
        this.scanner = new Scanner(inputStream);
        this.printStream = printStream;
    }

   public void start() {
        printStream.println("Enter number 1");
        int x = scanner.nextInt();
        printStream.println("Enter number 2");
        int y = scanner.nextInt();
        printStream.println("output: " + (x + y));
    }

    public static void main(String[] args) {
        Console userInputExample = new Console(System.in, System.out);
        userInputExample.start();
    }
}

    /* private final Scanner scanner;

    public Console()
    {
        this(new Scanner(System.in));
    }
    Console(Scanner scanner)
    {
        this.scanner  = scanner;
    }
    public String getInput() {
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        Console userInputExample = new Console(System.in, System.out);
        printStream.println("Enter number 1");
        int x = scanner.nextInt();
        this.printStream.println("Enter number 2");
        int y = scanner.nextInt();
        this.printStream.println("output: " + (x + y));
    }

}
*/