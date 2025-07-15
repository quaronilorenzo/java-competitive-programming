public class ArraySumPari {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        int sum = 0;
        for(int val : arr){
            if(val%2==0){
                sum += val;
            }
        }
        System.out.println(sum);
    }
}
