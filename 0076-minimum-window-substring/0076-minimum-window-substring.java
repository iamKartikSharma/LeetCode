class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch:t.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        int count=0;
        int j=0;
        int i =0;
        int len = Integer.MAX_VALUE;
        String ans = "";
        while(j<s.length()){
            if(map.containsKey(s.charAt(j))){
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)-1);
                if(map.get(s.charAt(j))>=0){
                    count++;
                }
            }
            

            while(count==t.length()){
                if(len>j-i+1){
                    len = j-i+1;
                    ans = s.substring(i,j+1);
                }

                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
                    if(map.get(s.charAt(i))>0){
                        count--;
                    }
                }
                i++;
            }

            
            j++;
        }
        return ans;
    }
}