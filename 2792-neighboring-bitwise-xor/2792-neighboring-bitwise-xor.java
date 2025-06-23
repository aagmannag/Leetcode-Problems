class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n = 0;
        for(int i : derived){
            n ^= i; 
        }
        if(n == 0) return true;
        return false;
    }
}