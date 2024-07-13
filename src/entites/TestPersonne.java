package entites;

import entites2.Personne;
    public class TestPersonne {

      public static void main(String[] args) {
            AdressePostale adresse1 = new AdressePostale(50, "Rue des chasseurs", "34070", "Montpellier");
            AdressePostale adresse2 = new AdressePostale(60, "Avenue de toulouse", "34070", "Montpellier");

            Personne personne1 = new Personne("Ngom", "Cheikh", adresse1);
            Personne personne2 = new Personne("Angelique", "Bori", adresse2);

            // Affichage
            System.out.println(personne1.nom + " " + personne1.prenom + ", Adresse: " + personne1.adresse.numeroRue + " " + personne1.adresse.libelleRue + ", " + personne1.adresse.codePostal + " " + personne1.adresse.ville);
            System.out.println(personne2.nom + " " + personne2.prenom + ", Adresse: " + personne2.adresse.numeroRue + " " + personne2.adresse.libelleRue + ", " + personne2.adresse.codePostal + " " + personne2.adresse.ville);
      }
}

