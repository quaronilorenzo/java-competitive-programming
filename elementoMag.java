import java.util.Scanner;

public class elementoMag {
    public static void main(String[] args) {
        // Dato un array ordinato di interi, scrivi un metodo che trovi l indice del primo elemento maggiore di un certo valore
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter x:");
        int x = myObj.nextInt();  // Read user input
        myObj.close();
        boolean flag = false;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] > x){
                System.out.println("Il primo indice del primo elemento maggiore di " + x + ": " + i);
                flag = true;
                return;
            }
        }
        if(flag == false){
            System.out.println("non c'è nessun indice di ogni elemento che è maggiore di x");
        }
        
    }
}
