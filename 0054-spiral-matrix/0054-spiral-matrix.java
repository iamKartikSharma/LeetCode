class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int top =0, bottom = n-1;
        int left = 0, right = m-1;
        List<Integer> ans = new ArrayList<>();

        while(top<=bottom && left<=right){
            for(int i = left ;i<=right;i++){
                ans.add(arr[top][i]);
            }
            top++;

            for(int i =top ; i<=bottom;i++){
                ans.add(arr[i][right]);
            }
            right--;
            for(int i = right;i>=left;i--){
                ans.add(arr[bottom][i]);
            }
            bottom--;

            for(int i = bottom ; i>=top;i--){
                ans.add(arr[i][left]);
            }
            left++;
        }

        return ans;
    }
}