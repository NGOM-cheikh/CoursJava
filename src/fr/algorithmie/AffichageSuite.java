package fr.algorithmie;

public class AffichageSuite {

    public static void main(String[] args) {
        afficherNombres1a10For();
        afficherNombresPairsFor();
        afficherNombresImpairsFor();
        afficherNombres1a10While();
        afficherNombresPairsWhile();
        afficherNombresImpairsWhile();
    }

    // Utiliser une boucle for pour afficher tous les nombres de 1 à 10 inclus
    public static void afficherNombres1a10For() {
        System.out.println("Nombres de 1 à 10 (for) :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // Utiliser une boucle for pour afficher tous les nombres pairs entre 0 et 10 inclus
    public static void afficherNombresPairsFor() {
        System.out.println("Nombres pairs entre 0 et 10 (for) :");
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
    }

    // Utiliser une boucle for pour afficher tous les nombres impairs entre 0 et 9 inclus
    public static void afficherNombresImpairsFor() {
        System.out.println("Nombres impairs entre 0 et 9 (for) :");
        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }
    }

    // Utiliser une boucle while pour afficher tous les nombres de 1 à 10 inclus
    public static void afficherNombres1a10While() {
        System.out.println("Nombres de 1 à 10 (while) :");
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    // Utiliser une boucle while pour afficher tous les nombres pairs entre 0 et 10 inclus
    public static void afficherNombresPairsWhile() {
        System.out.println("Nombres pairs entre 0 et 10 (while) :");
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i += 2;
        }
    }

    // Utiliser une boucle while pour afficher tous les nombres impairs entre 0 et 9 inclus
    public static void afficherNombresImpairsWhile() {
        System.out.println("Nombres impairs entre 0 et 9 (while) :");
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
    }
}
