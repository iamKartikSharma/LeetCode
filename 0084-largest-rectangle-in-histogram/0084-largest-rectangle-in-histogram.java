class Solution {
    int[] smallerLeft(int[] heights){
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

    int[] smallerRight(int[] heights){
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
    public int largestRectangleArea(int[] heights) {
        int [] prev = new int[heights.length];
        prev = smallerLeft(heights);

        int[] next = new int[heights.length];
        next = smallerRight(heights);

        int area = Integer.MIN_VALUE;

        for(int i =0;i<heights.length;i++){
            int l = heights[i];

            int b = next[i]-prev[i]-1;
            area = Math.max(area, l*b);
        }
        return area;
    }
}