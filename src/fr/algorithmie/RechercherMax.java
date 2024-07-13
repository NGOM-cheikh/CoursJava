package fr.algorithmie;

public class RechercherMax {
    public static void main(String[] args) {
        // Déclaration et initialisation du tableau array
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Initialiser la variable max avec la première valeur du tableau
        int max = array[0];

        // Parcourir le tableau pour trouver le plus grand élément
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Afficher le plus grand élément du tableau
        System.out.println("Le plus grand élément du tableau est : " + max);


        // Afficher le plus petit élément du tablau
        int min = array[0];
        // Parcourir le tableau pour trouver le plus petit élémént

        for (int i = 1; i > array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Le plus petit élément du tableau est : " + min);
    }
}

