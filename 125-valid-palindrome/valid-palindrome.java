import java.util.*;
public class Solution{
    public static boolean isPalindrome(String s){
        s=s.toLowerCase();
        s = s.replaceAll("[\\W,_\":]", "");
        //int n = s.length();
        if(s.isEmpty()){
            return true;
        }
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}