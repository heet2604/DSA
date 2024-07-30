Given a single sentence s, check if it is a palindrome or not. Ignore white spaces and any other character you may encounter. 

  
class Solution { 

    static boolean sentencePalindrome(String s) { 
        int l = 0;
        int h = s.length()-1;
        
        s=s.toLowerCase();
        
        while(l<=h){
            char getatl = s.charAt(l);
            char getath = s.charAt(h);
            
            if(!(getatl>='a' && getatl <='z')){
                l++;
            }
            else if(!(getath>='a' && getath<='z')){
                h--;
            }
            else if(getatl==getath){
                l++;
                h--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
