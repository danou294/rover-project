package input;// input.StringInputSource.java

import input.InputSource;

import java.util.Scanner;

public class StringInputSource implements InputSource {
    private Scanner scanner;

    public StringInputSource(String data) {
        scanner = new Scanner(data);
    }

    @Override
    public String readLine() {
        return scanner.hasNextLine() ? scanner.nextLine() : null;
    }

    @Override
    public boolean hasNextLine() {
        return scanner.hasNextLine();
    }
}
