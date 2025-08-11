package CompetitiveProgramming;
public class FormulaCoffee {
    // https://www.codewars.com/kata/57db78d3b43dfab59c001abe
    public static int formula(int h, int coffee) {
        for (int cups = 1; cups <= 5000; cups++) {
            h += coffee;
            String esad = Long.toHexString(h).toUpperCase();
            if (esad.contains("DEAD")) {
                return cups;
            }
        }
        return 0;
    }
    public static int[] limits(int date) {
        int cafe = 0xCAFE;
        int decaf = 0xDECAF;
        int regularLimit = formula(date, cafe);
        int decafLimit = formula(date, decaf);
        return new int[] {regularLimit, decafLimit};
    }
    public static void main(String[] args) {
        int h = 19641128;
        int[] cupsDeath = limits(h);
        System.out.println("Limite di caffeinati:" + cupsDeath[0] + " Limite decaffeinati:" + cupsDeath[1]); // [2645, 1162]
    }
}