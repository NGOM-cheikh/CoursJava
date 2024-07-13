package entites2;

 import entites.AdressePostale;

     public class Personne {

         public String nom;
         public String prenom;
         public AdressePostale adresse;

       //   Appeler le constructeur
       public Personne(String nom, String prenom, AdressePostale adresse) {
           this.nom = nom;
           this.prenom = prenom;
           this.adresse = adresse;

       }

     }
