import java.util.*;

public class SHORTEST_PATH_DIJKSTRA  {
    static class Edge {
        int dest;
        int weight;
        
        Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        ArrayList<ArrayList<Edge>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            adj.get(u).add(new Edge(v, w));
        }
        
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        
        long result = dijkstra(adj, n, s, t);
        System.out.println(result);
        
        scanner.close();
    }
    
    static long dijkstra(ArrayList<ArrayList<Edge>> adj, int n, int s, int t) {
        long[] dist = new long[n + 1];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[s] = 0;
        
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[1], b[1]));
        pq.offer(new long[]{s, 0});
        
        while (!pq.isEmpty()) {
            long[] current = pq.poll();
            int u = (int)current[0];
            long d = current[1];
            
            if (d > dist[u]) continue;
            
            for (Edge edge : adj.get(u)) {
                int v = edge.dest;
                long newDist = dist[u] + edge.weight;
                
                if (newDist < dist[v]) {
                    dist[v] = newDist;
                    pq.offer(new long[]{v, newDist});
                }
            }
        }
        
        return dist[t] == Long.MAX_VALUE ? -1 : dist[t];
    }
}