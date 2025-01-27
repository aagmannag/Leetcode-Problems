class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] d : prerequisites){
            adj.get(d[1]).add(d[0]);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] isCurrPath = new boolean[numCourses];

        for(int i = 0; i < numCourses; i++){
            if(!visited[i] && hasCycle(adj, i, visited, isCurrPath))
            {
                return false;
            }
        }
        return true;
    }

    boolean hasCycle(List<List<Integer>> adj, int i, boolean[] visited, boolean[] isCurrPath){
        if(isCurrPath[i]){
            return true;
        }

        if(visited[i]){
            return false;
        }

        isCurrPath[i] = true;
        visited[i] = true;

        for(int nbr : adj.get(i))
        {
            if(hasCycle(adj, nbr, visited, isCurrPath)){
                return true;
            }
        }
        isCurrPath[i] = false;
        return false;
    }
}