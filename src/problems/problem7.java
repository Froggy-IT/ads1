package problems;

public class problem7 {
    public static void reverseArray(int[] arr,int index){
        if(index<0) return;
        System.out.print(arr[index]+" ");
        reverseArray(arr,index-1);
    }
}
