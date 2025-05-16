class Solution {
    int MOD =(int)1e9+7;
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int[] prev = new int[arr.length];
        int[] next = new int[arr.length];
        long total=0;

        for(int i =0;i<arr.length;i++){
            while(!s.isEmpty()&& arr[s.peek()]>arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                prev[i]=-1;
            }else{
                prev[i]=s.peek();
            }
            s.push(i);
        }
        s.clear();

        for(int i =arr.length-1;i>=0;i--){
            while(!s.isEmpty()&& arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                next[i]=arr.length;
            }else{
                next[i]=s.peek();
            }
            s.push(i);
        }

        for(int i =0;i<arr.length;i++){
            int left = i- prev[i];
            int right = next[i]-i;

            total= (total+((long)arr[i]*left*right)%MOD)%MOD;
        }
        return (int)total;
    }
}