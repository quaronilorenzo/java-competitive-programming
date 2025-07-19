import java.util.HashMap;

public class carattereMaggiore {
    public static void main(String[] args) {
        String parola = "Banana";
        HashMap<Character, Integer> count = new HashMap<>();
        for (char c : parola.toCharArray()) {
            if (count.containsKey(c)){
                count.put(c, count.get(c) + 1);
            } else {
                count.put(c, 1);
            }
        }
        char maxChar = 0;
        int maxFreq = 0;

        for (char c : parola.toCharArray()) {
            int countP = count.get(c);
            if (countP > maxFreq) {
                maxFreq = countP;
                maxChar = c;
            }
        }
        System.out.println(maxChar);
    }
}
