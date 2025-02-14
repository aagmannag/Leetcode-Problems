class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] StrArray = new String[score.length];
        for(int i = 0; i < score.length; i++){
            StrArray[i] = String.valueOf(score[i]);
        }
        int[] sorted = Arrays.copyOf(score, score.length);
        Arrays.sort(sorted);
        HashMap<Integer, String> map = new HashMap<>();
        int rank = 1;
        for(int i = sorted.length-1; i >= 0; i--){
            if(rank == 1){
                map.put(sorted[i], "Gold Medal");
            } else if (rank == 2) {
                map.put(sorted[i], "Silver Medal");
            } else if (rank == 3) {
                map.put(sorted[i], "Bronze Medal");
            } else {
                map.put(sorted[i], String.valueOf(rank));
            }
            rank++;
        }
        for(int i = 0; i < score.length; i++){
            StrArray[i] = map.get(score[i]);
        }
        return StrArray;
    }
}