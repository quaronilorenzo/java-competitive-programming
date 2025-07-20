import java.util.HashMap;

public class primoCarattere {
    public static void main(String[] args) {
        String parola = "stress";
        int n = parola.toCharArray().length; // prendiamo la lunghezza della parola
        HashMap<Character, Boolean> primo = new HashMap<>(); // creiamo un hashmap dove metteremo ogni carattere con le volte che è ripetuto
        for(int i = 0; i < n; i++){
            char c = parola.charAt(i);
            if(primo.containsKey(c)){ // se il carattere è nel hasmap il valore della chiave aumenta 
                primo.put(c, false);
            }else{
                primo.put(c, true);
            }
        }
        for(int i = 0;  i < n; i++){
            char c = parola.charAt(i);
            if(primo.get(c) == true){
                System.out.println("Primo carattere non ripetuto: " + c);
                return;
            }
        }
    }
}
