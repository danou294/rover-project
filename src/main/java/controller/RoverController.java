package main.java.controller;


import input.InputSource;
import model.Grid;
import model.Orientation;
import model.Rover;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoverController {
    private InputSource inputSource;

    public RoverController(InputSource inputSource) {
        this.inputSource = inputSource;
    }

    public void execute() {
        if (!inputSource.hasNextLine()) return; // Assurez-vous qu'il y a une ligne à lire

        // Lire et configurer la grille
        String gridDimensions = inputSource.readLine();
        Scanner dimensionScanner = new Scanner(gridDimensions);
        int width = dimensionScanner.nextInt();
        int height = dimensionScanner.nextInt();
        Grid grid = new Grid(width, height);
        dimensionScanner.close();

        List<String> finalPositions = new ArrayList<>();

        while (inputSource.hasNextLine()) {
            String line = inputSource.readLine();
            if (line == null || line.trim().isEmpty()) break; // Si la ligne est vide, fin du fichier

            // Scanner pour lire la position initiale, l'orientation et les commandes pour chaque rover
            Scanner lineScanner = new Scanner(line);
            while (lineScanner.hasNextInt()) {
                int x = lineScanner.nextInt();
                int y = lineScanner.nextInt();
                Orientation orientation = Orientation.valueOf(lineScanner.next());
                Rover rover = new Rover(x, y, orientation, grid);

                if (lineScanner.hasNext()) {
                    String commands = lineScanner.next();
                    rover.processCommands(commands);
                    finalPositions.add(rover.getPosition());
                }
            }
            lineScanner.close();
        }

        // Affichage des positions finales de tous les rovers
        System.out.println("Positions finales des rovers : " + String.join(" ", finalPositions));
    }
}
