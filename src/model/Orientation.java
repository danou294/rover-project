package model;

public enum Orientation {
    // Les différentes orientations possibles : Nord, Est, Sud, Ouest
    N, // Nord
    E, // Est
    S, // Sud
    W; // Ouest

    // Méthode pour tourner à gauche dans une orientation donnée
    public Orientation turnLeft() {
        // Calcul de la nouvelle orientation en effectuant une rotation de 90 degrés vers la gauche
        // Utilisation de l'opérateur modulo (%) pour gérer le débordement et revenir à la première orientation après Ouest (W)
        return values()[(this.ordinal() + 3) % values().length];
    }

    // Méthode pour tourner à droite dans une orientation donnée
    public Orientation turnRight() {
        // Calcul de la nouvelle orientation en effectuant une rotation de 90 degrés vers la droite
        // Utilisation de l'opérateur modulo (%) pour gérer le débordement et revenir à la première orientation après Ouest (W)
        return values()[(this.ordinal() + 1) % values().length];
    }
}
