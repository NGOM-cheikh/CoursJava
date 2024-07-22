

/// LES ENUMERATIONS
package fr.diginamic.testenumeration;

    public class TestEnumeration {
        public static void main(String[] args) {
            // Affichage de toutes les saisons
            for (Saison saison : Saison.values()) {
                System.out.println(saison);
            }

            // Utilisation d'une méthode pour retrouver une saison par son nom
            String nom = "ETE";
            Saison saisonEte = Saison.valueOf(nom);
            System.out.println("Saison avec nom " + nom + " : " + saisonEte.getLibelle());

            // Utilisation de la méthode getByLibelle pour retrouver une saison par son libellé
            String libelle = "Hiver";
            Saison saisonHiver = Saison.getByLibelle(libelle);
            System.out.println("Saison avec libellé " + libelle + " : " + saisonHiver);
        }
    }
