
///APPRENDRE A UTLISER LE TRI


    package tri;

    public class Ville implements Comparable<Ville> {
        private String nom;
        private int nbHabitants;

        public Ville(String nom, int nbHabitants) {
            this.nom = nom;
            this.nbHabitants = nbHabitants;
        }

        public String getNom() {
            return nom;
        }

        public int getNbHabitants() {
            return nbHabitants;
        }

        ///   @Override
        ///  public int compareTo(Ville autreVille) {
        ///  return this.nom.compareTo(autreVille.getNom()); }

        /// Modifiez la classe Ville afin que désormais le tri se fasse sur le nombre d’habitants
        @Override
        public int compareTo(Ville autreVille) {
            return Integer.compare(this.nbHabitants, autreVille.getNbHabitants());


        }

        @Override
        public String toString() {
            return "Ville{" +
                    "nom='" + nom + '\'' +
                    ", nbHabitants=" + nbHabitants +
                    '}';
        }
    }
