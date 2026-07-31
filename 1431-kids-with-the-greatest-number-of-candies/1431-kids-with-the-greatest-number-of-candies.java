class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int maxCandy = Arrays.stream(candies).max().getAsInt();
        List<Boolean> ans = new ArrayList<>();

        for(int i=0 ; i<candies.length ; i++){
            if(candies[i] + extraCandies >= maxCandy){
                // maxCandy = candies[i] + extraCandies;
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}