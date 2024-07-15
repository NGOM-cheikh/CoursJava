
/// tP  APPRENDRE A REDEFINIR EQUALS

package fr.diginamic;

    public class Ville {
        private String nom;
        private int population;

        public Ville(String nom, int population) {
            this.nom = nom;
            this.population = population;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Ville ville = (Ville) o;

            if (population != ville.population) return false;
            return nom != null ? nom.equals(ville.nom) : ville.nom == null;
        }

        @Override
        public int hashCode() {
            int result = nom != null ? nom.hashCode() : 0;
            result = 31 * result + population;
            return result;
        }
    }
