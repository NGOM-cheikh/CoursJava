package fr.algorithmie;

public class AfficherIdentite {

    public static void main(String[] args) {
        // Votre identité
        String identite = "Votre Nom Complet";

        // Utiliser une boucle for pour afficher 10 fois l'identité
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + identite);
        }
    }
}
