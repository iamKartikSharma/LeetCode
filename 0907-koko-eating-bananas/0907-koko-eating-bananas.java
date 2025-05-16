class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int mini = 1;
        int maxi = piles[0];

        for(int i =1;i<piles.length;i++){
            maxi = Math.max(maxi, piles[i]);
        }
        int res = Integer.MAX_VALUE;

        while(mini<=maxi){
            int mid = mini+ (maxi-mini)/2;
            if(solve(piles, mid, h)){
                res = Math.min(res, mid);
                maxi = mid-1;
            }else{
                mini = mid+1;
            }

        }
        return res;
    }

    boolean solve(int[] piles, int mid , int h){
        int time =0;
        
        for(int pile:piles){
            time += Math.ceil((double) pile/mid);
        }
        return time<=h;
    }
}