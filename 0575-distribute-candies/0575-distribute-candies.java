class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : candyType){
            set.add(i);
        }
        int n = candyType.length;
        n /= 2;
        int setLen = set.size();
        if(setLen < n){
            return setLen;
        }else{
            return n;
        }
    }
}