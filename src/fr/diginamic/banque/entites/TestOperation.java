
// TP 12 ; heritage & abstraction

    package fr.diginamic.banque.entites;

        import fr.diginamic.banque.entites.Credit;
        import fr.diginamic.banque.entites.Debit;
        import fr.diginamic.banque.entites.Operation;

        public class TestOperation {
            public static void main(String[] args) {

                // Création d'un tableau d'opérations

                Operation[] operations = new Operation[4];
                operations[0] = new Credit("2018-07-01", 450.0);
                operations[1] = new Debit("2018-07-02", 30.0);
                operations[2] = new Credit("2018-07-03", 110.0);
                operations[3] = new Debit("2018-07-04", 15.0);

                // Affichage des informations des opérations

                for (Operation operation : operations) {
                    System.out.println(operation + ", Type: " + operation.getType());
                }

                // Calcul du montant global de toutes les opérations

                double montantGlobal = 0;
                for (Operation operation : operations) {
                    if (operation.getType().equals("DEBIT")) {
                        montantGlobal -= operation.getMontantOperation();
                    } else if (operation.getType().equals("CREDIT")) {
                        montantGlobal += operation.getMontantOperation();
                }
            }
                System.out.println("Montant global des opérations: " + montantGlobal);
        }

    }
