class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> adjList = new ArrayList<>();

        for(int i = 0; i < n; i++){
            adjList.add(new ArrayList<>());
        }

        int[] outDegree = new int[n];
        for(int i = 0; i < n; i++){
            for(int v : graph[i]){
                adjList.get(v).add(i);
            }
            outDegree[i] = graph[i].length;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (outDegree[i] == 0) q.add(i);
        }

        boolean[] safe = new boolean[n];
        while(!q.isEmpty()){
            int curr = q.poll();
            safe[curr] = true;
            for(int nbr: adjList.get(curr)){
                outDegree[nbr]--;
                if(outDegree[nbr] == 0) q.add(nbr);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (safe[i]) result.add(i);
        }
        return result;
    }
}