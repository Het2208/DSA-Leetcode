import java.util.*;

class Solution {

    public List<Integer> findMissingElements(int[] nums) {

        Set<Integer> set = new HashSet<>();

        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;

        for (int num : nums) {
            set.add(num);

            mn = Math.min(mn, num);
            mx = Math.max(mx, num);
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = mn + 1; i < mx; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }
}