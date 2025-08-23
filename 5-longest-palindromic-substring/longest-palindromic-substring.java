class Solution {

    public static boolean ispalin(String s){
        if(s.length()==0) return true;
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String str="";
        String longest = "";
        if(s.length()==0) return "";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                str = s.substring(i,j+1);
                if(ispalin(str) && str.length() > longest.length()){
                    longest = str;
                }
            }
        }
        return longest;
    }
}