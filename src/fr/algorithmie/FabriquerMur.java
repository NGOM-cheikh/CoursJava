package fr.algorithmie;

public class FabriquerMur {

    public static void main(String[] args) {
        // Tests de vérification
        verifier(3, 1, 8, true);
        verifier(3, 1, 9, false);
        verifier(3, 2, 10, true);
        verifier(3, 2, 8, true);
        verifier(3, 2, 9, false);
        verifier(6, 1, 11, true);
        verifier(6, 0, 11, false);
        verifier(1, 4, 11, true);
        verifier(0, 3, 10, true);
        verifier(1, 4, 12, false);
        verifier(3, 1, 7, true);
        verifier(1, 1, 7, false);
    }

    /**
     * Méthode pour vérifier s'il est possible de fabriquer un mur de la longueur spécifiée
     * en utilisant des briques de longueur 1 et 5.
     *
     * @param nbSmall le nombre de briques de longueur 1
     * @param nbBig le nombre de briques de longueur 5
     * @param longueur la longueur du mur à construire
     * @return true si c'est possible de construire le mur, false sinon
     */
    static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {

        // Calcul de la longueur maximale qu'on peut obtenir avec les briques disponibles
        int longueurMaximale = nbSmall + nbBig * 5;

        // Vérifier si la longueur demandée est inférieure ou égale à la longueur maximale possible
        return longueur <= longueurMaximale;
    }

    /**
     * Méthode pour vérifier les résultats de fabriquerMur avec divers paramètres.
     *
     * @param nbSmall le nombre de briques de longueur 1
     * @param nbBig le nombre de briques de longueur 5
     * @param longueur la longueur du mur à construire
     * @param b le résultat attendu de la méthode fabriquerMur pour ces paramètres
     */

    private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
        // Vérifier si le résultat de fabriquerMur correspond au résultat attendu
        if (fabriquerMur(nbSmall, nbBig, longueur) != b) {
            System.err.println("Test (" + nbSmall + ", " + nbBig + ", " +
                    longueur + ") NON passant.");
        }
    }
}
