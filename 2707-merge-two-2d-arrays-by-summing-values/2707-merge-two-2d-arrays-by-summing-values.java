class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        ArrayList<int[]> ans = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;
        int i = 0;
        int j = 0;
        while(i < n && j < m){
            if(nums1[i][0] == nums2[j][0]){
                ans.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            }else if(nums1[i][0] < nums2[j][0]){
                ans.add(new int[]{nums1[i][0], nums1[i][1]});
                i++;
            }else{
                ans.add(new int[]{nums2[j][0], nums2[j][1]});
                j++;
            }
        }
        while(i < n){
            ans.add(new int[]{nums1[i][0], nums1[i][1]});
            i++;
        }
        while(j < m){
            ans.add(new int[]{nums2[j][0], nums2[j][1]});
            j++;
        }
        int l = ans.size();
        int result[][] = new int[l][2];
        for(int k = 0; k < l; k++){
            result[k] = ans.get(k);
        }
        return result;
    }
}