package fr.tableaux;

public class ExerciceTableauChaines {

  public static void main(String[] args) {
    // Déclaration et initialisation du tableau de chaînes de caractères
    String[] villes = {"Paris", "Lyon", "Marseille", "Bordeaux", "Toulouse"};

    // Afficher les 5 éléments du tableau
    System.out.println("Éléments du tableau avant modification :");
    for (int i = 0; i < villes.length; i++) {
        System.out.println("Index " + i + ": " + villes[i]);
    }

    // Afficher la longueur du tableau
    System.out.println("Longueur du tableau : " + villes.length);

    // Modifier l'élément d'index 3 avec la valeur de ville "Reims"
    villes[3] = "Reims";

    // Afficher les 5 éléments du tableau après modification
    System.out.println("Éléments du tableau après modification :");
    for (int i = 0; i < villes.length; i++) {
        System.out.println("Index " + i + ": " + villes[i]);
    }
  }
}
