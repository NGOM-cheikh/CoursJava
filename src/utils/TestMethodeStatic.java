
package utils;

    public class TestMethodeStatic {
        public static void main(String[] args) {
            // Déclarez une variable de type chaîne de caractères qui contient un nombre entier
            String chaine = "12";

            // Utilisez la méthode parseInt de la classe java.lang.Integer pour convertir la chaîne en entier
            int nombreConverti = Integer.parseInt(chaine);

            // Affichez le nombre converti
            System.out.println("Le nombre converti est : " + nombreConverti);

            // Déclarez maintenant 2 variables de type int a et b
            int a = 10;
            int b = 20;

            // Utilisez la méthode max de la classe Integer pour trouver le nombre maximum entre a et b
            int max = Integer.max(a, b);

            // Affichez le résultat de l’appel de cette méthode
            System.out.println("Le nombre maximum entre " + a + " et " + b + " est : " + max);
    }
}
