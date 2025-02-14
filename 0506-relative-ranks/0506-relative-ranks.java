import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] stringArray = new String[score.length];
        for(int i = 0; i < score.length; i++) {
            stringArray[i] = String.valueOf(score[i]);
        }
        
        // Sort the scores array in descending order
        int[] sortedScores = Arrays.copyOf(score, score.length);
        Arrays.sort(sortedScores);
        
        // Create a map to store the rank of each score
        Map<Integer, String> rankMap = new HashMap<>();
        int rank = 1;
        for(int i = sortedScores.length - 1; i >= 0; i--) {
            if (rank == 1) {
                rankMap.put(sortedScores[i], "Gold Medal");
            } else if (rank == 2) {
                rankMap.put(sortedScores[i], "Silver Medal");
            } else if (rank == 3) {
                rankMap.put(sortedScores[i], "Bronze Medal");
            } else {
                rankMap.put(sortedScores[i], String.valueOf(rank));
            }
            rank++;
        }
        
        // Assign ranks to the original scores
        for(int i = 0; i < score.length; i++){
            stringArray[i] = rankMap.get(score[i]);
        }
        
        return stringArray;
    }
}
