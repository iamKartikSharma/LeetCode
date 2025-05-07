class Solution {
    Boolean[][] dp;
    boolean solve(String s, String p, int i, int j){
        if(i>=s.length() && j>=p.length()){
            return true;
        }

        if( j>=p.length()){
            return false;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }

        if(i==s.length()){
            while(j<p.length() && p.charAt(j)=='*'){
                j++;
            }
            return j==p.length();
        }
        
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'){
            return dp[i][j]=solve(s, p, i+1, j+1);
        }  
        if(p.charAt(j)=='*'){
            return dp[i][j]=solve(s, p, i+1, j) || solve(s, p, i, j+1);
        }
        return dp[i][j]=false;

    }
    public boolean isMatch(String s, String p) {
        dp = new Boolean[s.length()+1][p.length()+1];
        return solve(s, p, 0, 0);
    }
}