class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int top =0, bottom = n-1;
        int left = 0, right = m-1;
        List<Integer> ans = new ArrayList<>();

        int count =0;
        int total = n*m;

        while(count<total){
            for(int i = left ;i<=right && count<total;i++){
                ans.add(arr[top][i]);
                count++;
            }
            top++;

            for(int i =top ; i<=bottom && count<total ;i++){
                ans.add(arr[i][right]);
                count++;
            }
            right--;
            for(int i = right;i>=left && count<total ;i--){
                ans.add(arr[bottom][i]);
                count++;
            }
            bottom--;

            for(int i = bottom ; i>=top && count<total ;i--){
                ans.add(arr[i][left]);
                count++;
            }
            left++;
        }

        return ans;
    }
}