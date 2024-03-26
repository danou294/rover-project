package model;

public class Grid {
    private final int width; // Largeur de la grille
    private final int height; // Hauteur de la grille

    // Constructeur de la classe model.Grid
    public Grid(int width, int height) {
        this.width = width; // Initialisation de la largeur de la grille
        this.height = height; // Initialisation de la hauteur de la grille
    }

    // Méthode pour vérifier si une position est valide dans la grille
    public boolean isValidPosition(int x, int y) {
        // La position est valide si elle se trouve à l'intérieur des limites de la grille
        return x >= 0 && x <= this.width && y >= 0 && y <= this.height;
    }

    // Méthode pour imprimer la grille avec la position du rover
    public void printGrid(Rover rover) {
        // Parcours de la grille en commençant par la ligne du haut jusqu'à celle du bas
        for (int y = this.height; y >= 0; y--) {
            // Parcours de chaque colonne de la grille
            for (int x = 0; x <= this.width; x++) {
                // Vérifie si la position actuelle correspond à la position du rover
                if (rover.getX() == x && rover.getY() == y) {
                    // Si oui, imprime le rover avec son orientation
                    System.out.print("[" + rover.getOrientation().charAt(0) + "]");
                } else {
                    // Sinon, imprime une case vide
                    System.out.print("[ ]");
                }
            }
            // Nouvelle ligne après chaque rangée
            System.out.println();
        }
    }
}
