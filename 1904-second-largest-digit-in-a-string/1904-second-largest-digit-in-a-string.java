class Solution {
    public int secondHighest(String s) {
        HashSet<Integer> hs = new HashSet<>();

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                hs.add(c - '0');
            }
        }

        int[] arr = new int[hs.size()];
        int k = 0;

        for(int i : hs){
            arr[k++] = i;
        }

        Arrays.sort(arr);

        if(arr.length < 2){
            return -1;
        }
        return arr[arr.length - 2];
    }
}