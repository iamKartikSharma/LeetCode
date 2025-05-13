class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int left =0;
        int right =0;
        int countOdd =0;
        int result =0;
        int temp=0;
        
        while(right<nums.length){
            if(nums[right]%2 == 1){
                countOdd++;
                temp=0;
            }

            while(countOdd==k){
                temp++;
                if(nums[left]%2==1){
                    countOdd--;
                }
                left++;
            }
            result+=temp;
            right++;

        }
        return result;
    }
}