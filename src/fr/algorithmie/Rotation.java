package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {

        // Déclaration du tableau d'entiers
        int[] nums = {0, 1, 2, 3}; // Modifier ici pour tester avec différents tableaux

        // Rotation à droite des éléments
        rotateRight(nums);

        // Affiche du tableau après rotation

        System.out.print("Tableau après rotation : ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Méthode pour effectuer une rotation à droite des éléments d'un tableau

    public static void rotateRight(int[] nums) {
        if (nums.length <= 1) {
            return; // Pas de rotation nécessaire si le tableau a 0 ou 1 élément
        }

        // Sauvegarder le dernier élément du tableau
        int last = nums[nums.length - 1];

        // Décaler tous les éléments d'une position vers la droite
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }

        // Placer le dernier élément à la première position
        nums[0] = last;
    }
}
