
package entites;

public class AdressePostale {
    private int numeroRue;
    private String libelleRue;
    private String codePostal;
    private String ville;

    public AdressePostale(int numeroRue, String libelleRue, String codePostal, String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    @Override
    public String toString() {
        return numeroRue + " " + libelleRue + ", " + codePostal + " " + ville;
    }
}
