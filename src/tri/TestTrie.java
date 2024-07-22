
 package tri;
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.Comparator;
    import java.util.List;

    public class TestTrie {
        public static void main(String[] args) {
            ArrayList<Ville> villes = new ArrayList<>();
            villes.add(new Ville("Nice", 343000));
            villes.add(new Ville("Carcassonne", 47800));
            villes.add(new Ville("Narbonne", 53400));
            villes.add(new Ville("Lyon", 484000));
            villes.add(new Ville("Foix", 9700));
            villes.add(new Ville("Pau", 77200));
            villes.add(new Ville("Marseille", 850700));
            villes.add(new Ville("Tarbes", 40600));

            // Filtrer les villes de plus de 25000 habitants
            List<Ville> villesFiltrees = new ArrayList<>();
            for (Ville ville : villes) {
                if (ville.getNbHabitants() > 25000) {
                    villesFiltrees.add(ville);
                }
            }

            // Triez la liste par ordre décroissant de population
            villesFiltrees.sort(Comparator.comparingInt(Ville::getNbHabitants).reversed());

            // Affichez le résultat
            for (Ville ville : villesFiltrees) {
                System.out.println(ville);
            }
        }
    }
