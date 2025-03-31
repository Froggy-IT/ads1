package problems;


public class problem2 {
    public static double findAverage(int[] arr,int n){
        if(n==0) return 0;
        return(findSum(arr,n)/(double)n);
    }
    public static int findSum(int[] arr, int n){
        if(n==0) return 0;
        return arr[n-1]+findSum(arr,n-1);
    }
}
