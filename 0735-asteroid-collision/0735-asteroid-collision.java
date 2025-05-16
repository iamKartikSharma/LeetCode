class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();

        for(int i =0;i<asteroids.length;i++){
            boolean check = true;
            while(!s.isEmpty() && s.peek()>0 && asteroids[i]<0){
                if(Math.abs(asteroids[i])>s.peek()){
                    s.pop();
                    continue;
                }else if(Math.abs(asteroids[i])==s.peek()){
                    s.pop();
                }
                check = false;
                break;
                
            }
            if(check){
                s.push(asteroids[i]);
            }
            
        }
        int[] arr = new int[s.size()];
        int j =s.size()-1;
        while(!s.isEmpty()){
            arr[j--]= s.pop();
        }
        return arr;
    }
}