class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        k = k%n;

        // int[] arr= new int[k];
        
        // for(int i =0;i<k;i++){
        //     arr[i]=nums[n-k+i];
        // }
        // int j=0;

        // for(int i = n-k-1;i>=0;i--){
        //     nums[n-j-1]= nums[i];
        //     j++;
        // }

        // for(int i =0;i<k;i++){
        //     nums[i]=arr[i];
        // }

        reverse(nums, 0, n-1);

        reverse(nums, 0,k-1);

        reverse(nums, k, n-1);

    }

    void reverse(int[] nums, int start, int end){
        while(start<=end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}