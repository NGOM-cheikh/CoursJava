
// TP 12 ; heritage & abstraction

package fr.diginamic.banque.entites;

    public abstract class Operation {
        private final String dateOperation;
        private final double montantOperation;

        public Operation(String dateOperation, double montantOperation) {
            this.dateOperation = dateOperation;
            this.montantOperation = montantOperation;
        }

        public String getDateOperation() {
            return dateOperation;
        }

        public double getMontantOperation() {
            return montantOperation;
        }

        public abstract String getType();

        @Override
        public String toString() {
            return "Date: " + dateOperation + ", Montant: " + montantOperation;
    }
}
