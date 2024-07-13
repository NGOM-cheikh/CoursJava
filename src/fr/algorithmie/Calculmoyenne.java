package fr.algorithmie;

public class Calculmoyenne{

    public static void main(String[] args) {
    // Déclaration et initialisation du tableau array
    int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

    // Initialiser la variable somme à 0
    int somme = 0;

    // Parcourir le tableau pour calculer la somme de ses éléments
    for (int i = 0; i < array.length; i++) {
        somme += array[i];
    }

    // Calculer la moyenne
    double moyenne = (double) somme / array.length;

    // Afficher la moyenne des éléments du tableau
    System.out.println("La moyenne des éléments du tableau est : " + moyenne);

    }
}