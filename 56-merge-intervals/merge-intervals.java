class Solution {
    public int[][] merge(int[][] intervals) {
       if(intervals.length <=1 ) return intervals;
       Arrays.sort(intervals,(a,b)-> a[0] - b[0]);
       ArrayList<int[]> merged = new ArrayList<>();
       int current[] = intervals[0];
       for(int i=0;i<intervals.length;i++){
            if(current[1]>=intervals[i][0]){
                current[1] = Math.max(current[1],intervals[i][1]);
            }else{
                merged.add(current);
                current = intervals[i];
            }
       }
       merged.add(current);
       return merged.toArray(new int [merged.size()][]);
    }
}