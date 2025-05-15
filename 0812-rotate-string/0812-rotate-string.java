class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int m = goal.length();
        if(n!=m){
            return false;
        }

        int i =0;
        StringBuilder help = new StringBuilder(s);
        while(i<s.length()){
            if(help.toString().equals(goal)){
                return true;
            }
            help.append(help.charAt(0));
            help.deleteCharAt(0);
            i++;
        }
        return false;
    }
}