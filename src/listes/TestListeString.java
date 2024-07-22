package listes;

    import java.util.ArrayList;
    import java.util.List;

    public class TestListeString {
        public static void main(String[] args) {
            List<String> villes = new ArrayList<String>();
            villes.add("Nice");
            villes.add("Carcassonne");
            villes.add("Narbonne");
            villes.add("Lyon");
            villes.add("Foix");
            villes.add("Pau");
            villes.add("Marseille");
            villes.add("Tarbes");

            // Rechercher la ville avec le plus grand nombre de lettres
            String villeMax = "";
            for (String ville : villes) {
                if (ville.length() > villeMax.length()) {
                    villeMax = ville;
                }
            }
            System.out.println("Ville avec le plus grand nombre de lettres : " + villeMax);

            // Mettre tous les noms de villes en majuscules
            for (int i = 0; i < villes.size(); i++) {
                villes.set(i, villes.get(i).toUpperCase());
            }

            // Supprimer les villes dont le nom commence par 'N'
            villes.removeIf(ville -> ville.startsWith("N"));

            // Afficher la liste résultante
            for (String ville : villes) {
                System.out.println(ville);
            }
        }
    }
