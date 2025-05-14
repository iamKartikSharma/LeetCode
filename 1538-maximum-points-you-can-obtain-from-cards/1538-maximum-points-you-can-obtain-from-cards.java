class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum =0;
        int result =0;

        for(int i =0;i<k;i++){
            sum+= cardPoints[i];
        }

        result = Math.max(result , sum);

        sum=0;
        for(int i =cardPoints.length-1;i>=(cardPoints.length-k);i--){
            sum+= cardPoints[i];
        }
        result= Math.max(result, sum);
        int start=0;
        for(int i = cardPoints.length -k ;i<cardPoints.length-1;i++){
            sum-=cardPoints[i];
            sum+= cardPoints[start];
            result = Math.max(result, sum);
            start++;

        }
        return result;

    }
}