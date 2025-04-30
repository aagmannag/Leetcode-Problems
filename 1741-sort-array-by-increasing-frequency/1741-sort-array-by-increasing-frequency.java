class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        Integer temp[] = new Integer[map.size()]; // For comprator
        int i = 0;
        // Sort the Keys
        for(Integer key : map.keySet()){
            temp[i] = key;
            i++;
        }
        Arrays.sort(temp, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                if(map.get(a) == map.get(b)){
                    return b - a; // Dec order of value
                }
                return map.get(a) - map.get(b); // Inc order of value
            }
        });
        i = 0;
        for(int key : temp){
            int f = map.get(key);
            for(int j = 0; j < f; j++){
                nums[i] = key;
                i++;
            }
        }
        return nums;
    }
}