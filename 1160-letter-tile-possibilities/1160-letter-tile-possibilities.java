class Solution {
    int l;
    public int numTilePossibilities(String tiles) {
        l = tiles.length();
        boolean[] used = new boolean[l];
        HashSet<String> set = new HashSet<>();
        prob(tiles, used, set ,"");
        return set.size() - 1;
    }
    private void prob(String tiles, boolean[] used, HashSet<String> set, String cur){
        if(set.contains(cur)) return;
        set.add(cur);
        for(int i = 0; i < l; i++){
            if(used[i]) continue;
            used[i] = true;
            prob(tiles, used, set, cur + tiles.charAt(i));
            used[i] = false;
        }
    }
}