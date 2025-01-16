// 0 -> not colored
// 1 -> blue
// -1 -> red
class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        for(int i = 0; i < graph.length; i++){
            if(color[i] == 0 && !validColor(graph, color, 1, i)) return false;
        }
        return true;
    }
    public boolean validColor(int[][] g, int[] color, int c, int node){
        if(color[node] != 0){
            return color[node] == c;
        }
        color[node] = c;
        for(int n : g[node]){
            if(!validColor(g, color, -c, n)) return false;
        }
        return true;
    }
}