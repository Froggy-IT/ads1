package problems;

public class problem3 {
    public static boolean isPrime(int n,int i){
        if (n<2)return false;
        if(i*i>n)return true;
        if(n%i==0)return false;
        return isPrime(n,i+1);
    }
}
