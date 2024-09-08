class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int l=0;
        int r=height.length-1;
        while(l<=r){
            int h=Math.min(height[l],height[r]);
            int w = r-l;
            int curr=h*w;
            max=Math.max(curr,max);
            
            if(height[l]<height[r]){
                l++;
            }
            else {
                r--;
            }
        }
        return max;
    }
}