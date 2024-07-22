package entites2;

    import entites.AdressePostale;

    public class Personne {
        private String nom;
        private String prenom;
        private AdressePostale adresse;

        public Personne(String nom, String prenom, AdressePostale adresse) {
            this.nom = nom;
            this.prenom = prenom;
                this.adresse = adresse;
        }

        public void afficherNomPrenom() {
            System.out.println(nom.toUpperCase() + " " + prenom);
        }

        public void modifierNom(String nom) {
            this.nom = nom;
        }

        public void modifierPrenom(String prenom) {
            this.prenom = prenom;
        }

        public void modifierAdresse(AdressePostale adresse) {
            this.adresse = adresse;
        }

        public String getNom() {
            return nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public AdressePostale getAdresse() {
            return adresse;
        }
    }
