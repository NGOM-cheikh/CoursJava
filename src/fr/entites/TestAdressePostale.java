package entites2;

import entites.AdressePostale;

class TestPersonne {
    public static void main(String[] args) {
        // Création des instances d'AdressePostale
        AdressePostale adresse1 = new AdressePostale(1, "Rue de Paris", "75001", "Paris");
        AdressePostale adresse2 = new AdressePostale(2, "Avenue des Champs-Élysées", "75008", "Paris");

        // Création des instances de Personne
        Personne personne1 = new Personne("Dupont", "Jean", adresse1);
        Personne personne2 = new Personne("Martin", "Lucie", adresse2);

        // Affichage des informations des personnes
        personne1.afficherNomPrenom();
        personne2.afficherNomPrenom();

        // Modification des attributs des personnes
        personne1.modifierNom("Durand");
        personne1.modifierPrenom("Paul");
        personne1.modifierAdresse(adresse2);

        // Affichage des informations modifiées des personnes
        personne1.afficherNomPrenom();
        System.out.println("Adresse : " + personne1.getAdresse());
        System.out.println("Nom : " + personne1.getNom());
        System.out.println("Prénom : " + personne1.getPrenom());
    }
}
