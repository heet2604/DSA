class Solution {
    public int search(int[] nums, int target) {
        int pivot = findpivot(nums);
        if (pivot == -1) {
            return binary(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return binary(nums, target, 0, pivot - 1);
        }
        return binary(nums, target, pivot + 1, nums.length - 1);
    }

    public int findpivot(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            // Case 1: mid > mid+1
            if (mid < e && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            // Case 2: mid < mid-1
            if (mid > s && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // Case 3: left side is unsorted
            if (nums[s] > nums[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }

    public int binary(int[] nums, int x, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == x) {
                return mid;
            } else if (nums[mid] > x) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }
}
