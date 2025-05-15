class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];

        for(int i =1;i<strs.length;i++){
            ans = solve(ans, strs[i]);
        }
        return ans;
    }

    String solve(String ans, String s){
        int i =0;
        StringBuilder res = new StringBuilder();
        while(i<ans.length() && i< s.length()){
            if(ans.charAt(i)==s.charAt(i)){
                res.append(s.charAt(i));
            }else{
                break;
            }
            i++;
            
        }
        return res.toString();
    }
}