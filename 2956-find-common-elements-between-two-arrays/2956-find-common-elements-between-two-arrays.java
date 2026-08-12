class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int a=0;
        int b=0;        
        for(int i=0 ; i<nums1.length ; i++){
            for(int j=0 ; j<nums2.length ; j++){
                if(nums1[i] == nums2[j]){
                    a++;
                    break;
                }
            }
        }

        for(int i=0 ; i<nums2.length ; i++){
            for(int j=0 ; j<nums1.length ; j++){
                if(nums1[j] == nums2[i]){
                    b++;
                    break;
                }
            }
        }

        return new int[]{a,b};
    }
}