class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int maxi = bloomDay[0];

        for(int i =1;i<bloomDay.length;i++){
            maxi = Math.max(bloomDay[i], maxi);
        }

        int res = Integer.MAX_VALUE;
        int mini=1;
        while(mini<=maxi){
            int mid = mini+ (maxi-mini)/2;

            if(solve(bloomDay, mid , m , k)){
                res = Math.min(res, mid);
                maxi = mid -1;
            }else{
                mini = mid+1;
            }

        }

        return res ==Integer.MAX_VALUE ? -1: res;
    }

    boolean solve(int[] bloomDay, int mid , int m , int k){
        int totalBouquet =0;
        int adj=0;
        for(int bloom: bloomDay){
            if(bloom<=mid){
                adj++;
            }else{
                adj=0;
            }

            if(adj==k){
                totalBouquet++;
                adj=0;
            }
        }

        return totalBouquet>=m;
    }
}