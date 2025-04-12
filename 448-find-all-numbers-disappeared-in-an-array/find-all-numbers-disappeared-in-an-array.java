class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
            ArrayList<Integer> list  = new ArrayList<>();
            // boolean present[] = new boolean [nums.length+1];

            // for(int i=0;i<nums.length;i++){
            //     present[nums[i]]=true;
            // }

            // for(int i=1;i<=nums.length;i++){
            //     if(present[i]==false){
            //         list.add(i);
            //     }
            // }
            // return list;
            int i=0;
            while(i<nums.length){
                int correct = nums[i]-1;
                if(nums[i]!=nums[correct]){
                    int temp = nums[i];
                    nums[i]=nums[correct];
                    nums[correct] = temp;
                }
                else{
                    i++;
                }
            }
            for(int j=0;j<nums.length;j++){
                if(nums[j]!=j+1){
                    list.add(j+1);
                }
            }
            return list;
    }
}