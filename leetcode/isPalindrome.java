package leetcode;

import java.util.Locale;

public class isPalindrome {
    public static boolean isPalindrome(String line) {
        for(int i=0, j=line.length()-1; i<j; i++, j--){
            while (i<j){
                i++;
            }while (i<j){
                j--;
            }
            if(!(Character.toLowerCase(line.charAt(i))==Character.toLowerCase(line.charAt(j)))){
                return false;
            }
        }return true;
    }

    public static void main(String[] args) {
        String s = "race a car";
        System.out.printf(String.valueOf(isPalindrome(s)));
    }
}
