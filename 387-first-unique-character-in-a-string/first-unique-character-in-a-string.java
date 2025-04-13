class Solution {
    public int firstUniqChar(String s) {
        // for(int i=0;i<s.length();i++){
        //     boolean flag=false;
        //     for(int j=0;j<s.length();j++){
        //         if( i!=j && s.charAt(i)==s.charAt(j)){
        //             flag=true;
        //             break;
        //         }
        //     }
        //     if(!flag){
        //         return i;
        //     }
        // }
        // return -1;
        char arr[] = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : arr){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        //Set<Character> set = map.keySet();
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                return i;
            }
        }
        return -1;
    }
}