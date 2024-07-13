package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        // Déclaration et initialisation des deux tableaux
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};

        // Détermination de la longueur du plus long tableau
        int maxLength = Math.max(array1.length, array2.length);

        // Création du tableau somme
        int[] sommeArray = new int[maxLength];

        // Calculer la somme des éléments  des deux tableaux
        for (int i = 0; i < maxLength; i++) {
            int value1 = i < array1.length ? array1[i] : 0;
            int value2 = i < array2.length ? array2[i] : 0;
            sommeArray[i] = value1 + value2;
        }

        // Affichage des éléments du tableau sommeArray
        System.out.print("Tableau des sommes : ");
        for (int i = 0; i < sommeArray.length; i++) {
            System.out.print(sommeArray[i] + " ");
        }
    }
}
