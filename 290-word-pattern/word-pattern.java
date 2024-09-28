class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String>map = new HashMap<>();
        String str[] = s.split(" ");         //converts the string to an array 

        if(pattern.length()!=str.length){
            return false;
        }
        for(int i=0;i<str.length;i++){
            char c = pattern.charAt(i);
            if(map.containsKey(c)){
                if(!map.get(c).equals(str[i])){
                    return false;
                }
            }
            else{
                if(map.containsValue(str[i])){
                    return false;
                }
                map.put(c,str[i]);
            }
        }
        return true;
    }  
}