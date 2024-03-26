# Projet Contrôle des Rovers Martiens

Ce projet implémente un système de contrôle pour des rovers martiens se déplaçant sur une grille. Chaque rover peut être programmé pour effectuer une série d'instructions et naviguer sur la grille en conséquence.

## Fonctionnalités

- Lecture des instructions à partir d'un fichier d'entrée
- Déplacement des rovers en fonction des instructions fournies
- Gestion des collisions et des limites de la grille

## Structure du Projet

Le projet est organisé comme suit :

- `src/` : Contient le code source principal de l'application.
  - `controller/` : Logique de contrôle de l'application.
  - `model/` : Modèles de données pour les rovers, la grille, etc.
  - `input/` : Classes pour gérer les entrées (fichiers, chaînes, etc.).
  - `Main.java` : Point d'entrée de l'application.

- `test/` : Contient les tests unitaires et d'intégration.
  - `controller/` : Tests pour la logique de contrôle.
  - `model/` : Tests pour les modèles de données.
  - `input/` : Tests pour les classes de gestion des entrées.

## Installation et Exécution

1. Cloner le dépôt GitHub :

```bash
git clone https://github.com/danou294/rover-project.git
```

2. Se rendre dans le projet :

```bash
cd RoverProject
```

3. Executer l'application:

```bash
java src/Main.java  
```