class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int r = 0;
        int l = 0;
        while(r < n && l < m){
            if(g[r] <= s[l]){
                r++;
            }
            l++;
        }
        return r;
    }
}