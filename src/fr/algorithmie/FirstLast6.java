package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {

        // Déclaration du tableau d'entiers
        int[] nums = {1, 2, 6}; // Modifier ici pour tester avec différents tableaux

        // Calcul de la valeur booléenne
        boolean result = (nums.length >= 1) && (nums[0] == 6 || nums[nums.length - 1] == 6);

        // Affichage du résultat
        System.out.println("Le tableau contient le premier ou le dernier élément égal à 6 : " + result);
    }
}
