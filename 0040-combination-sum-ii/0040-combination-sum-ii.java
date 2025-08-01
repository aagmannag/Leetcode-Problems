class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, ans, new ArrayList<>(), 0);
        return ans;
    }
    private void backtrack(int[] candidate, int target, List<List<Integer>> ans, List<Integer> store, int start){
        if(target == 0){
            ans.add(new ArrayList<>(store));
        }

        if(target < 0){
            return;
        }

        for(int i = start; i < candidate.length; i++){
            if(i > start && candidate[i] == candidate[i-1]){
                continue;
            }
            store.add(candidate[i]);
            backtrack(candidate, target - candidate[i], ans, store, i+1);
            store.remove(store.size() - 1);
        }
    }
}