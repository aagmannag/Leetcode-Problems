class Solution {
    public int[] findOrder(int n, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adjList.add(new ArrayList<>());
        }

        int[] indegree = new int[n];
        for(int i = 0; i < prerequisites.length; i++){
            adjList.get(prerequisites[i][1]).add(prerequisites[i][0]);
            indegree[prerequisites[i][0]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) q.add(i);
        }

        int[] result = new int[n];  
        int index = 0;

        while(!q.isEmpty()){
            int curr = q.poll();
            result[index++] = curr;

            for(int nbr: adjList.get(curr)){
                indegree[nbr]--;
                if(indegree[nbr] == 0) q.add(nbr);
            }
        }

        if (index != n) return new int[0];

        return result;
    }
}