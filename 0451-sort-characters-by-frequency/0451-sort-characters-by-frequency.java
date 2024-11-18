class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c,hm.getOrDefault(c, 0) + 1);
        }
        ArrayList<Character> list = new ArrayList<>(hm.keySet());
        list.sort((a,b) -> hm.get(b) - hm.get(a));

        StringBuilder sb = new StringBuilder();
        for(char c : list){
            int count = hm.get(c);
            for(int i = 0; i < count; i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}