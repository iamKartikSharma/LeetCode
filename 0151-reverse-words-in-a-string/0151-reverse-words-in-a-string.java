class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\s++");
        reverse(str, 0, str.length-1);

        StringBuilder ans = new StringBuilder();

        for(int i =0;i<str.length;i++){
            if(i==str.length-1){
                ans.append(str[i]);
            }else{
                ans.append(str[i]);
                ans.append(" ");
            }
            
        }
        return ans.toString();
    }

    void reverse(String[] s , int start, int end){
        while(start<=end){
            String temp = s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }
}