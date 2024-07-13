package fr.algorithmie;

public class AffichageInverse {
    public static void main(String[] args) {
        // Déclaration et initialisation du tableau array
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Afficher l’ensemble des éléments du tableau
        System.out.println("Éléments du tableau dans l'ordre :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Afficher l’ensemble des éléments dans l’ordre inverse du tableau
        System.out.println("Éléments du tableau dans l'ordre inverse :");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }

        // Afficher l’ensemble des éléments du tableau arrayCopy pour vérifier la copie
        System.out.println("Éléments du tableau arrayCopy :");
        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.print(arrayCopy[i] + " ");
        }
        System.out.println();
    }
}

