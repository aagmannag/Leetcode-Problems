class Solution {
    public static int[] nextGreater(int[] nums){
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        for(int i = 0 ; i < n ; i++){
            while(!st.isEmpty() && nums[i] > nums[st.peek()]){
                res[st.peek()] = nums[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            res[st.peek()] = -1;
            st.pop();
        }
        return res;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nge = new int[nums2.length];
        nge = nextGreater(nums2);
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < nge.length ; i++){
            hm.put(nums2[i] , nge[i]);
        }
        int[] ans = new int[nums1.length];
        for(int j = 0 ; j < nums1.length ; j++){
            ans[j] = hm.get(nums1[j]);
        }
        return ans;
    }
}