class Solution {
    Boolean[] dp = new Boolean[10001];
    boolean solve(int[] nums, int idx){
        if(idx>= nums.length){
            return false;
        }
        if(idx==nums.length-1){
            return true;
        }
        if(dp[idx]!=null){
            return dp[idx];
        }

        for (int jump = 1; jump <= nums[idx]; jump++) {
            if (solve(nums, idx + jump)) {
                return dp[idx]=true;
            }
        }

        return dp[idx]=false;

    }
    public boolean canJump(int[] nums) {
        
        return solve(nums, 0);
    }
}