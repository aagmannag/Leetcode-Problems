class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> temp = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int num: nums1){
            temp.put(num, temp.getOrDefault(num , 0) + 1);
        }

        for(int num: nums2){
            if(temp.containsKey(num) && temp.get(num) > 0){
                ans.add(num);
                temp.put(num, temp.get(num)-1);
            }
        }
        int[] arr = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}