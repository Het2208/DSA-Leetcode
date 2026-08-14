class Solution {
    public int maximumLengthSubstring(String s) {
        int l=0;
        int r=0;
        HashMap<Character , Integer> map = new HashMap<>();
        int maxLength=0;
        while(r < s.length()){
            char ch = s.charAt(r);
            map.put(ch , map.getOrDefault(ch , 0) + 1);
            while(map.get(ch) > 2){
                char leftchar = s.charAt(l);
                map.put(leftchar , map.get(leftchar) - 1);
                l++;   
            }
            maxLength = Math.max(maxLength , (r-l+1));
            r++;
        }
        return maxLength;
    }
}