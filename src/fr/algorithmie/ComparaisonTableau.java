package fr.algorithmie;

public class ComparaisonTableau {

    public static void main(String[] args) {

        // Déclaration et initialisation des deux tableaux

        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};

        // Initialisation du compteur d'éléments en commun

        int commonCount = 0;

        // Parcours de chaque élément du premier tableau

        for (int i = 0; i < array1.length; i++) {
            // Parcours de chaque élément du second tableau
            for (int j = 0; j < array2.length; j++) {

                // Comparaison des éléments des deux tableaux
                if (array1[i] == array2[j]) {
                    // Si un élément commun est trouvé, incrémenter le compteur
                    commonCount++;
                    // Sortir de la boucle intérieure pour éviter les doublons
                    break;
                }
            }
        }

        // Affichage du nombre d'éléments en commun
        System.out.println("Nombre d'éléments en commun : " + commonCount);
    }
}
