class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(s.charAt(i)=='('){
                if(!stack.isEmpty()){
                    ans.append(ch);
                }
                stack.push(ch);
            }else{
                stack.pop();
                if(!stack.isEmpty()){
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}