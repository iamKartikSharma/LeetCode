class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        int n = nums.length;
        Stack<Integer> s = new Stack<>();
        Arrays.fill(ans,-1);

        for(int i =0;i<n*2;i++){
            while(!s.isEmpty() && nums[s.peek()]<nums[i%n]){
                ans[s.pop()]=nums[i%n];
            }
            if(i<n){
                s.push(i);
            }
        }
        return ans;

    }
}