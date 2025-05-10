class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k)- atMostK(nums, k-1);
    }

    int atMostK(int[] nums, int k){
        int res=0;
        int left =0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int right=0; right< nums.length;right++){

            map.put(nums[right], map.getOrDefault(nums[right], 0)+1);

            if(map.get(nums[right])==1){
                k--;
            }

            while(k<0){
                map.put(nums[left], map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                    k++;
                }
                left++;
            }
            res+= right-left+1;
        }
        return res;
    }
}