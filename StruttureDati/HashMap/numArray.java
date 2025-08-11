package StruttureDati.HashMap;
import java.util.HashMap;
import java.util.Map;

public class numArray {
    // Trova il numero che appare più volte in un array
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,2,5,5,5};
        HashMap<Integer, Integer> num = new HashMap<>();
        for( int i : arr){
            if(num.containsKey(i)){
                num.put(i, num.get(i) + 1);
            }else{
                num.put(i, 1);
            }
        }
        int maxValue = arr[0];
        int maxFreq = 1;

        for(Map.Entry<Integer, Integer> entry : num.entrySet()){
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                maxValue = entry.getKey();
            }
        }
        System.out.println(maxValue);
    }
    
}