class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), nums, 0);
        return ans;
    }
    private void backtrack(List<List<Integer>> ans, List<Integer> store, int[] nums, int idx){
        ans.add(new ArrayList<>(store));
        for(int i = idx; i < nums.length; i++){
            store.add(nums[i]);
            backtrack(ans, store, nums, i+1);
            store.remove(store.size() - 1);
        }
    }
}