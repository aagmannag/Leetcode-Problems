class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adjList.add(new ArrayList<>());
        }
        int[] indegree = new int[n];
        for(int i = 0; i < prerequisites.length; i++){
            adjList.get(prerequisites[i][0]).add(prerequisites[i][1]);
            indegree[prerequisites[i][1]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(indegree[i] == 0) q.add(i);
        }
        
        List<Integer> linearOrder = new ArrayList<>();
        while(!q.isEmpty()){
            int curr = q.poll();
            linearOrder.add(curr);

            for(int nbr: adjList.get(curr)){
                indegree[nbr]--;
                if(indegree[nbr] == 0) q.add(nbr);
            }
        }

        if(linearOrder.size() == n) return true;

        return false;
    }
}