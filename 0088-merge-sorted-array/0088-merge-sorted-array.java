class Solution {
    public void merge(int[] nums1, int n, int[] nums2, int m) {
        int l=0;
        int r=0;
        int[] res = new int[n+m];
        int k=0;
        while(l<n && r<m){
            if(nums1[l] < nums2[r]){
                res[k++] = nums1[l];
                l++;
            }
            else{
                res[k++] = nums2[r];
                r++;
            }
        }
        while(l<n){
            res[k++] = nums1[l];
            l++;
        }
        while(r<m){
            res[k++] = nums2[r];
            r++;
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = res[i];
        }
    }
}