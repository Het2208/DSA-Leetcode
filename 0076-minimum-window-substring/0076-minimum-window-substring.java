class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        int[] hash = new int[256];
        for (char ch : t.toCharArray()) {
            hash[ch]++;
        }

        int l = 0;
        int r = 0;

        int count = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = -1;

        while (r < s.length()) {

            if (hash[s.charAt(r)] > 0) {
                count++;
            }

            hash[s.charAt(r)]--;
            
            while (count == t.length()) {

                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    startIndex = l;
                }

                hash[s.charAt(l)]++;

                if (hash[s.charAt(l)] > 0) {
                    count--;
                }

                l++;
            }

            r++;
        }

        return startIndex == -1 ? "" : s.substring(startIndex, startIndex + minLen);
    }
}