class Solution {
    public int subarraySum(int[] arr, int target) {
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     int sum = 0;
            
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum==k){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        //Using hashmaps
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int prefix = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            prefix+=arr[i];
           if(map.containsKey(prefix-target)){
                count+=map.get(prefix-target);
           } 

           map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}