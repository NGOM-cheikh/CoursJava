   /// APPRENDRE A UTLISER LE TRI

    package tri;

    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.List;

    public class TestTri {
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

        // Triez la liste
            Collections.sort(villes);

        // Affichage  résultat
            for (Ville ville : villes) {
                System.out.println(ville);
            }
        }

    }