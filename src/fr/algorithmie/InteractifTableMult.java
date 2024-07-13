package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nombre;

        // Demander à l'utilisateur de saisir un nombre entre 1 et 10
        do {
            System.out.print("Entrez un nombre entre 1 et 10 : ");
            nombre = scanner.nextInt();

            if (nombre < 1 || nombre > 10) {
                System.out.println("Le nombre saisi n'est pas valide. Veuillez réessayer.");
            }

        } while (nombre < 1 || nombre > 10);

        // Afficher la table de multiplication pour le nombre saisi
        System.out.println("Table de " + nombre + " :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(nombre + " * " + i + " = " + (nombre * i));
        }
    }
}
