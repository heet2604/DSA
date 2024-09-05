class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0]; // If there's only one element, return it.
        }

        Arrays.sort(nums); // Sort the array

        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] != nums[i + 1]) { 
                return nums[i]; // If current element is not equal to the next one, it is the single number.
            }
            i += 2; // Skip the next element as they are a pair
        }
    // If the single number is the last element in the sorted array
        return nums[nums.length - 1];
    }
}