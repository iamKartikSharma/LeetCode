class Solution {
    public void rotate(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for(int i =0;i<arr.length;i++){
            for(int j =i;j<m;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        int i =0;
        int j = m-1;

        while(i<j){
            int a =0;
            while(a<n){
                int temp = arr[a][i];
                arr[a][i]= arr[a][j];
                arr[a][j]=temp;
                a++;
            }
            i++;
            j--;
        }

    }
}