
// Tp num 9 suite


package fr.diginamic.banque.entites;

import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        // Création des instances de comptes
        Compte compte1 = new Compte("123456", 1000.0);
        CompteTaux compte2 = new CompteTaux("789012", 2000.0, 1.5);

        // Création du tableau de comptes
        Compte[] comptes = new Compte[2];
        comptes[0] = compte1;
        comptes[1] = compte2;

        // Affichage des informations des comptes
        for (Compte compte : comptes) {
            System.out.println(compte);
        }
    }
}
