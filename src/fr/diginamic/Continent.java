/// Exercice 2 : LES ENUMERATIONS

    package fr.diginamic;

    public enum Continent {
        EUROPE("Europe"),
        ASIE("Asie"),
        AFRIQUE("Afrique"),
        OCEANIE("Océanie"),
        AMERIQUE("Amérique");

        private String libelle;

        Continent(String libelle) {
            this.libelle = libelle;
        }

        public String getLibelle() {
            return libelle;
        }
    }
