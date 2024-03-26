package input;// input.FileInputSource.java

import input.InputSource;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputSource implements InputSource {
    private Scanner scanner;

    public FileInputSource(String filePath) throws FileNotFoundException {
        scanner = new Scanner(new File(filePath));
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
