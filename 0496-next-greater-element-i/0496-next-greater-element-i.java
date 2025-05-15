class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0;i<nums2.length;i++){
            map.put(nums2[i], solve(nums2, nums2[i], i));
        } 
        int[] res = new int[nums1.length];
        for(int i =0;i<nums1.length;i++){
            res[i]=map.get(nums1[i]);
        }
        return res;
    }

    int solve(int[] arr, int num , int idx){
        int res=-1;
        for(int i =idx+1;i<arr.length;i++){
            if(num<arr[i]){
                res=arr[i];
                break;
            }
        }
        return res;
    }
}