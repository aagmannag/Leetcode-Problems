class Solution {
    public int minimumLength(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int ans = 0;
        for(int count : map.values()){
            if(count % 2 == 0){
                ans += 2;
            }
            else{
                ans++;
            }
        }
        return ans;
    }
}