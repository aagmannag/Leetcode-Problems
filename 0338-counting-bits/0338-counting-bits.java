class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i = 0; i <= n; i++){
            int count = 0;
            int mask = 1;
            for(int j = 0; j < 32; j++){
                if((mask & i) != 0){
                    count++;
                }
                mask <<= 1;
            }
            ans[i] = count;
        }
        return ans;
    }
}