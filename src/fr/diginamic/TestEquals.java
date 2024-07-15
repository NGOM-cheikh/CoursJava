
/// tP  APPRENDRE A REDEFINIR EQUALS

    package fr.diginamic;

    public class TestEquals {
        public static void main(String[] args) {
            Ville ville1 = new Ville("Montpellier", 150000);
            Ville ville2 = new Ville("Sete", 50000);
            Ville ville3 = new Ville("Narbonne", 30000);

            // Méthode equals()
            System.out.println("Test de la méthode equals()");
            System.out.println(ville1.equals(ville2)); // true
            System.out.println(ville1.equals(ville3)); // false

            // Tester
            System.out.println("Test de l'opérateur ==");
            System.out.println(ville1 == ville2); // false
            System.out.println(ville1 == ville3); // false

            // Pour que == retourne true, les deux variables doivent référencer le même objet
            Ville ville4 = ville1;
            System.out.println(ville1 == ville4); // true
        }
    }
