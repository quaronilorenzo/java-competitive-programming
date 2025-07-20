public class SecMaxArr {
    public static void main(String[] args) {
        int[] arr = {33,356,563,22,335,11010};
        int maxIndex = 0;
        int secMaxIndex = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                secMaxIndex = maxIndex;
                maxIndex = i;
            } else if (arr[i] != arr[maxIndex]) {
                if (secMaxIndex == -1 || arr[i] > arr[secMaxIndex]) {
                    secMaxIndex = i;
                }
            }
        }
        System.out.println("Secondo massimo: " + arr[secMaxIndex]);
    }
}
