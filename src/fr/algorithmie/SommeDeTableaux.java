package fr.algorithmie;

public class SommeDeTableaux {
    public static void main(String[] args) {

        // Déclaration  tableaux
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};

        // Vérification que les deux tableaux ont la même longueur
        if (array1.length != array2.length) {
            System.out.println("Les tableaux n'ont pas la même longueur.");
            return;
        }

        // Création du tableau somme
        int[] sommeArray = new int[array1.length];

        // Calcul de la somme des éléments correspondants des deux tableaux
        for (int i = 0; i < array1.length; i++) {
            sommeArray[i] = array1[i] + array2[i];
        }

        // Affichage du tableau sommeArray
        System.out.print("Tableau des sommes : ");
        for (int i = 0; i < sommeArray.length; i++) {
            System.out.print(sommeArray[i] + " ");
        }
    }
}

