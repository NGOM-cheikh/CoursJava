
// tp13 CLASSE STRINGBUILDER

    package fr.diginamic.chaines;

    public class TestStringBuilder {

        public static void main(String[] args) {

// Chronométrer avec StringBuilder
            long startTime = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= 100000; i++) {
                sb.append(i);
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Temps écoulé avec StringBuilder: " + (endTime - startTime) + " ms");

// Chronométrer avec String et opérateur de concaténation +

            startTime = System.currentTimeMillis();
            String str = "";
            for (int i = 1; i <= 100000; i++) {
                str += i;
            }
            endTime = System.currentTimeMillis();
            System.out.println("Temps écoulé avec String et concaténation: " + (endTime - startTime) + " ms");
        }
    }
