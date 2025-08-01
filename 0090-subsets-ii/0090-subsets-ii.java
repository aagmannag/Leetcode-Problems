class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, ans, new ArrayList<>(), 0);
        return ans;
    }
    private void backtrack(int[] nums, List<List<Integer>> ans, List<Integer> store, int start){
        ans.add(new ArrayList<>(store));
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1]){
                continue;
            }
            store.add(nums[i]);
            backtrack(nums, ans, store, i+1);
            store.remove(store.size() - 1);
        }
    }
}