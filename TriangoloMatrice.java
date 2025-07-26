public class TriangoloMatrice {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                    System.out.print("1 ");
            }
        System.out.println();
        }
        /* ottimo esercizio per capire bene come lavorare coi for, perchè se noi guardiamo il
        secondo ciclo for capiamo che stamperà fino alla lunghezza della riga fino ad'ora, 
        quindi se siamo al primo giro introurremo j = 0, stamperà 1 e POI fa la condizione perchè funziona cosi il cilo for
        */
    }
}