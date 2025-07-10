class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        backtrack(result, tempList, nums, new boolean[nums.length]);
        return result;
    }
    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, boolean[] used){
        if(tempList.size() == nums.length && !result.contains(tempList)){
            result.add(new ArrayList<>(tempList));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;

            used[i] = true;
            tempList.add(nums[i]);

            backtrack(result, tempList, nums, used);

            used[i] = false;
            tempList.remove(tempList.size()-1);
        }
    }
}