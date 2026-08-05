class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] res = new int[s.length()];
        int n = s.length();
        int last = -n;
        for(int i=0 ; i<n ; i++){
            if(s.charAt(i) == c){
                last = i;
            }
            res[i] = i-last;
        }
        last = n * 2;
        for(int i=n-1 ; i>=0 ; i--){
            if(s.charAt(i) == c){
                last = i;
            }
            res[i] = Math.min(res[i] , last-i);
        }
        return res;
    }
}