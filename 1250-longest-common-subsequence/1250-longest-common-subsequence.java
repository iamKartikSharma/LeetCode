class Solution {
    int[][] dp=new int[1001][1001];
    int solve(String text1, String text2, int i, int j){
        if(j==text2.length() || i==text1.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int pick =0;
        if(text1.charAt(i)==text2.charAt(j)){
            pick = 1+ solve(text1, text2, i+1, j+1);
        }
        int skip = solve(text1, text2, i+1, j);
        int skip2 = solve(text1, text2, i, j+1);

        return dp[i][j]=Math.max(pick, Math.max(skip,skip2));
    }
    
    public int longestCommonSubsequence(String text1, String text2) {
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(text1, text2, 0, 0);
    }
}