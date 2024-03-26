package model;

import model.Grid;
import model.Orientation;

public class Rover {
    private int x; // Position horizontale du rover
    private int y; // Position verticale du rover
    private Orientation orientation; // model.Orientation actuelle du rover
    private final Grid grid; // Grille sur laquelle le rover se déplace

    // Constructeur de la classe model.Rover
    public Rover(int x, int y, Orientation orientation, Grid grid) {
        this.x = x; // Initialisation de la position horizontale du rover
        this.y = y; // Initialisation de la position verticale du rover
        this.orientation = orientation; // Initialisation de l'orientation du rover
        this.grid = grid; // Initialisation de la grille sur laquelle le rover se déplace
    }

    // Méthode pour tourner à gauche
    public void turnLeft() {
        this.orientation = this.orientation.turnLeft(); // Appel de la méthode turnLeft() de l'orientation actuelle
    }

    // Méthode pour tourner à droite
    public void turnRight() {
        this.orientation = this.orientation.turnRight(); // Appel de la méthode turnRight() de l'orientation actuelle
    }

    // Méthode pour faire avancer le rover d'une case
    public void moveForward() {
        int newX = x, newY = y; // Nouvelles coordonnées pour le mouvement

        // Utilisation d'une instruction switch pour déterminer le déplacement en fonction de l'orientation actuelle
        switch (this.orientation) {
            case N -> newY++; // Déplacement vers le nord
            case E -> newX++; // Déplacement vers l'est
            case S -> newY--; // Déplacement vers le sud
            case W -> newX--; // Déplacement vers l'ouest
        }

        // Vérification si la nouvelle position est valide dans la grille
        if (grid.isValidPosition(newX, newY)) {
            x = newX; // Mise à jour de la position horizontale
            y = newY; // Mise à jour de la position verticale
        }
    }

    // Méthode pour traiter une série de commandes (G, D, A)
    public void processCommands(String commands) {
        // Parcours de chaque caractère de la chaîne de commandes
        for (char command : commands.toCharArray()) {
            // Utilisation d'une instruction switch pour exécuter la commande appropriée
            switch (command) {
                case 'G' -> turnLeft(); // Tourner à gauche
                case 'D' -> turnRight(); // Tourner à droite
                case 'A' -> moveForward(); // Avancer
            }
        }
    }

    // Méthode pour obtenir la position actuelle du rover
    public String getPosition() {
        return x + " " + y + " " + orientation; // Concaténation des coordonnées et de l'orientation
    }

    // Getters pour x, y, et orientation si nécessaire pour la grille
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getOrientation() {
        return orientation.name(); // Retourne le nom de l'orientation
    }
}
