class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        boolean[] seen = new boolean[128];

        for(int i=0 ; i<jewels.length() ; i++){
            char ch = jewels.charAt(i);
            seen[ch] = true;
        }

        for(int i=0 ; i<stones.length() ; i++){
            char ch = stones.charAt(i);
            if(seen[ch] == true){
                count++;
            }
        }
        return count;
    }
}