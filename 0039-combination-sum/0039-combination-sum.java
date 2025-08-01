class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(candidates, target, ans, new ArrayList<>(), 0);
        return ans;
    }
    private void backtrack(int[] candidates, int target, List<List<Integer>> ans, List<Integer> store, int start){
        
        if(target == 0){
            ans.add(new ArrayList<>(store));
        }

        if(target < 0){ 
            return;
        }

        for(int i = start; i < candidates.length; i++){
            store.add(candidates[i]);
            backtrack(candidates, target - candidates[i], ans, store, i);
            store.remove(store.size() - 1);
        }
    }
}