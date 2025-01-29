class Solution {
    private int[] parent;

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        parent = new int[n+1];
        for(int i = 0; i <= n; i++) parent[i] = i;

        for(int[] edge: edges){
            if(find(edge[0]) == find(edge[1])) return edge;
            union(edge[0], edge[1]);
        }
        return new int[0];
    }

    int find(int node) {
        if (parent[node] != node) {
            parent[node] = find(parent[node]);
        }
        return parent[node];
    }

    void union(int i, int j) {
        int iRoot = find(i);
        int jRoot = find(j);

        if (iRoot != jRoot) {
            parent[jRoot] = iRoot;
        }
    }
}
