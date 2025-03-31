package problems;

public class problem6 {
    public static int power(int a,int n){
        if(n==0)return 1;
        if(n%2==0)return power(a*a,n/2);
        return a*power(a,n-1);
    }
}
