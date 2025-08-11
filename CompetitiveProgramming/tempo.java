package CompetitiveProgramming;
public class tempo {
    public static void printTempo(int[] arr){
        boolean tutto0 = true;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] != 0){
                tutto0 = false;
            }
        }
        if(tutto0){
            System.out.println("Now");
        }else{
            int posizioneAnd = -1;
            for(int i = 0 ; i < arr.length; i++){
                if(arr[i] != 0){
                    posizioneAnd = i;
                }
            }
            if(arr[0] != 0){
                System.out.print(arr[0] + " years,");
            }
            if(arr[1] != 0){
                if(posizioneAnd != 1){
                    System.out.print(arr[1] + " days,");
                }else{
                    System.out.print(" and " + arr[1] + " days");
                }
            }
            if(arr[2] != 0){
                if(posizioneAnd != 2){
                    System.out.print( arr[2] + " hours,");
                }else{
                    System.out.print(" and " + arr[2] + " hours");
                }
            }
            if(arr[3] != 0){
                if(posizioneAnd != 3){
                    System.out.print(arr[3] + " minutes,");
                }else{
                    System.out.print(" and " + arr[3] + " minutes");
                }
            }
            if(arr[4] != 0){
                if(posizioneAnd != 4){
                    System.out.print(", " + arr[4] + " seconds");
                }else{
                    System.out.print(" and " + arr[4] + " seconds");
                }
            }
        }
        
    }
    public static int[] modificaTempo(int[] time){
        time = modifica60(time, 4);
        time = modifica60(time, 3);
        time = modificaGiorni(time, 2);
        time = modificaAnni(time, 1);
        printTempo(time);
        return time;
    }
    public static int[] modifica60(int[] time, int index){
        time[index-1] = time[index] / 60;
        time[index] = time[index] % 60;
        return time;
    }
    public static int[] modificaGiorni(int[] time, int index){
        time[index-1] = time[index] / 24;
        time[index] = time[index] % 24;
        return time;
    }
    public static int[] modificaAnni(int[] time, int index){
        time[index-1] = time[index] / 365;
        time[index] = time[index] % 365;
        return time;
    }
    
    
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,93223400};
        arr = modificaTempo(arr);
    }
}
