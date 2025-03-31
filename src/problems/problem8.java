package problems;

public class problem8 {
    public static boolean isAllDigits(String s,int index){
        if(index==s.length())return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isAllDigits(s,index+1);
    }
}
