import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0;
        int maxLength = 0;
        Map<Character, Integer> hash = new HashMap<>();
        for(int r=0 ; r<n ; r++){
            char ch = s.charAt(r);
            if(hash.containsKey(ch) && hash.get(ch) >= l){
                l = hash.get(ch) + 1;
            }
            maxLength = Math.max(maxLength , r-l+1);
            hash.put(ch, r);
        }

        return maxLength;           
    }
}
 