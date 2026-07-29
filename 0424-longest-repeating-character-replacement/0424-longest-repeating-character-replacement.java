class Solution {
    public int characterReplacement(String s, int k) {

        int l = 0;
        int maxLength = 0;
        int maxFreq = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {

            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(ch));

            while ((r - l + 1) - maxFreq > k) {

                char left = s.charAt(l);
                map.put(left, map.get(left) - 1);

                maxFreq = 0;
                for (int freq : map.values()) {
                    maxFreq = Math.max(maxFreq, freq);
                }

                l++;
            }

            maxLength = Math.max(maxLength, r - l + 1);
        }

        return maxLength;
    }
}