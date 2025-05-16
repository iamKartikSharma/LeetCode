class Solution {
    int[] nsl(int[] heights){
        int[] arr = new int[heights.length];
        Stack<Integer> s = new Stack<>();

        for(int i =0;i<arr.length;i++){
            while(!s.isEmpty() && heights[s.peek()]> heights[i]){
                s.pop();
            }
            arr[i]= s.isEmpty() ? -1: s.peek();

            s.push(i);
        }
        return arr;
    }

    int[] nsr(int[] heights){
        Stack<Integer> s = new Stack<>();

        int[] arr = new int[heights.length];

        for(int i = heights.length-1;i>=0;i--){
            while(!s.isEmpty()&& heights[s.peek()]>=heights[i]){
                s.pop();
            }
            arr[i] = s.isEmpty() ? heights.length: s.peek();

            s.push(i);
        }
        return arr;
    }
    int findArea(int[] heights){
        int[] prev = new int[heights.length];
        prev = nsl(heights);
        int[] next = new int[heights.length];
        next = nsr(heights);

        int area = 0;
        
        for(int i =0;i<heights.length;i++){
            int l = heights[i];
            int b = next[i]- prev[i]-1;

            area = Math.max(area, l*b);
        }
        return area;

    }
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0) return 0;
        int n = matrix.length;
        int m = matrix[0].length;

        int[] heights= new int[m];

        for(int i =0;i<m;i++){
            heights[i]=matrix[0][i] =='1' ? 1:0;
        }

        int maxArea = findArea(heights);

        for(int i =1;i<n;i++){
            for(int j =0;j<m;j++){
                if(matrix[i][j]=='0'){
                    heights[j]=0;
                }else{
                    heights[j] += 1;
                }
            }
            maxArea = Math.max(maxArea, findArea(heights));
        }
        return maxArea;
    }
}