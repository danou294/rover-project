// Main.java

import input.FileInputSource;
import input.InputSource;
import main.java.controller.RoverController;


import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            InputSource inputSource = new FileInputSource("src/input.txt");
            RoverController controller = new RoverController(inputSource);
            controller.execute();
        } catch (FileNotFoundException e) {
            System.err.println("Le fichier d'entrée n'a pas été trouvé.");
        }
    }
}
