import java.util.HashMap;
import java.util.Map;

public class valPiuRipetuto {
    public static void main(String[] args) {
        // Scrivi una funzione Java che trovi l’elemento che si ripete più volte in un array di interi.
       // Se ci sono più elementi con la stessa frequenza massima, restituisci uno qualsiasi.
        int[] arr = {1,2,2,3,3,3,5,5};
        HashMap<Integer,Integer> values = new HashMap<>();
        for(int i : arr){
            if(values.containsKey(i)){
                values.put(i, values.get(i) + 1);
            }else{
                values.put(i, 1);
            }
        }
        int maxFreq = 0;
        int maxElem = arr[0];
        for(Map.Entry<Integer, Integer> entry : values.entrySet()){
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                maxElem = entry.getKey();
            }
        }
        System.out.println(maxElem);
    }
    
}