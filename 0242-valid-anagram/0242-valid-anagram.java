class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] arr1 = new int[26];

        for(int i=0 ; i<s.length() ; i++){
            arr1[s.charAt(i) - 'a']++;
            arr1[t.charAt(i) - 'a']--;
        }
        for(int i=0 ; i<arr1.length ; i++){
            if(arr1[i] != 0){
                return false;
            }
        }
        return true;
    }
}