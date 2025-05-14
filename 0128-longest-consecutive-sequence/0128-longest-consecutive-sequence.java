class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num: nums){
            pq.add(num);
        }
        int currentStreak =1;
        int result=1;

        while(!pq.isEmpty()){
            int num = pq.poll();
            if(!pq.isEmpty() && num==pq.peek()){
                continue;
            }else if(!pq.isEmpty() && num+1==pq.peek()){
                currentStreak++;
            }else{
                currentStreak=1;
            }

            result = Math.max(result, currentStreak);
        }
        return result;
    }
}