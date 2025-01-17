class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int res = 0;
        if(nums2.length%2!=0){
        for(int i = 0; i < nums1.length; i++){
            res = res^nums1[i];
        }
        }
        if(nums1.length%2!=0){
        for(int i = 0; i < nums2.length; i++){
            res = res^nums2[i];
        }
        }
        return res;
    }
}