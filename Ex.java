public class Ex {
    public static void mergeSort(int[] arr, int left, int right){
        if(left < right){ // se left che è sempre 0 è minore della lunghezza dell'array continuiamo a dividere, creando un "loop"
            int mid = (left + right) / 2; // la lunghezza del array viene divisa a metà
            mergeSort(arr,left,mid); // ridividiamo l'array per la parte sinistra [0-5]
            mergeSort(arr, mid + 1, right); // la metà viene incrementata di uno perchè il range ora è destro [6-10] 
            merge(arr, left, mid, right); // chiamiamo il merge
        }
    }
    public static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left + 1; // aggiungiamo 1 per il loop for successivo, è il range [0-5] 
        int n2 = right - mid; // loop destro [5-10]
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i = 0 ; i < n1 ; i++){ // i 2 for per mettere dentro gli array momentanei -
            L[i] = arr[left+i];
        }
        for(int j = 0; j < n2; j++){
            R[j] = arr[mid + 1 + j];
        }
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) { // se un numero a sinistra è piu piccolo di destra lo mettiamo nel array e vice versa
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) { // SE CI SONO ancora valori ripartiamo dal N e prendiamo i valori rimanenenti
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) { // SE CI SONO ancora valori ripartiamo dal N e prendiamo i valori rimanenenti
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void main(String args[]){
        int[] arr = {8, 3, 5, 2};
        mergeSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
