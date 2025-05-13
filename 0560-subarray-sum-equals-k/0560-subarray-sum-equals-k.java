class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum =0;
        int result = 0;

        int left =0;
        
        for(int right =0;right<nums.length;right++){
            sum += nums[right];

            while(sum>k){
                sum-= nums[left];
                left++;
            }
            if(sum==k && left<nums.length){
                result++;
            }
            
        }
        

        return result;
    }
}