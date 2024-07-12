package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        // Déclaration et initialisation du tableau d'entiers
        int[] tableau = {8, -7, 12, 1, -2, 14, 17, 9};

        // Afficher l'élément du tableau d'index 0
        System.out.println("Élément à l'index 0 : " + tableau[0]);

        // Afficher la longueur du tableau
        System.out.println("Longueur du tableau : " + tableau.length);

        // Afficher l'entier positionné au dernier index du tableau
        System.out.println("Élément au dernier index : " + tableau[tableau.length - 1]);
    }
}