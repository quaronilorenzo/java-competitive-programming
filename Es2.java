public class Es2 {
    public static int[] modificaTempo(int[] time){
        time = modifica60(time, 4);
        return time;
    }
    public static int[] modifica60(int[] time, int index){
        int count = 0;
        count = time[index] / 60;
        while(time[index] >= 60){ // finchè o i secondi o minuti non sono meno di 60
            
            time[index]--; // secondi che mi rimangono
        }
        System.out.println(count);
        return time;
    }
    
    
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,65};
        arr = modificaTempo(arr);
    }
}
