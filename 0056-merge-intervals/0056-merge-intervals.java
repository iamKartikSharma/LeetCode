class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        int i =0;
       
        List<int []> ls = new ArrayList<>();
        while(i<intervals.length){
            int[] ans = new int[2];
            ans[0]=intervals[i][0];
            int num = intervals[i][1];
            while(i+1<intervals.length&& num>=intervals[i+1][0]){
                
                i++;
                num = Math.max(num, intervals[i][1]);
            }
            ans[1]=num;
            ls.add(ans);
            i++;
        }
        int[][] arr = ls.toArray(new int[0][]);
        return arr;
    }
}