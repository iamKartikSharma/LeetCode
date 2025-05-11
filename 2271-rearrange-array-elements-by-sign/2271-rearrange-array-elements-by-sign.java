class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        int i=0,j=0;
        for(int k =0;k<nums.length;k++){
            if(nums[k]>=0){
                pos[i++]=nums[k];
            }else{
                neg[j++]=nums[k];
            }
            
        }
        i=0;
        j=0;
        int k =0;
        while(k<nums.length){
            nums[k++]=pos[i++];
            nums[k++]=neg[j++];
        }
        return nums;
        
    }
}