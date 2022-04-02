import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MaximumFlow {
    private Edge[][] graph;
    private Map<Integer, List<Integer>> adjacencyList = new HashMap<>();
    private int sink;
    private int source;

    public void parse() {
        String[] config;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line;

        try {
            config = br.readLine().split(" ");

            int nbrOfNodes = Integer.parseInt(config[0]);
            int nbrOfEdges = Integer.parseInt(config[1]);
            source = Integer.parseInt(config[2]);
            sink = Integer.parseInt(config[3]);

            graph = new Edge[nbrOfNodes][nbrOfNodes];

            for (int i = 0; i < nbrOfEdges; i++) {
                line = br.readLine().split(" ");

                int node1 = Integer.parseInt(line[0]);
                int node2 = Integer.parseInt(line[1]);
                int capacity = Integer.parseInt(line[2]);

                addToAdjacencyList(node1, node2);
                addToAdjacencyList(node2, node1);

                Edge e = new Edge(node1, node2, capacity);
                Edge e2 = new Edge(node2, node1, capacity);

                graph[node1][node2] = e;
                graph[node2][node1] = e2;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addToAdjacencyList(int node1, int node2) {

        if (adjacencyList.containsKey(node1)) {
            adjacencyList.get(node1).add(node2);
        } else {
            List<Integer> list = new ArrayList<>();
            list.add(node2);
            adjacencyList.put(node1, list);
        }
    }


    public int bfs() {
        Queue<Integer> queue = new PriorityQueue<>();
        Set<Integer> visisted = new HashSet<>();

        visisted.add(source);
        queue.offer(source);

        Edge[] path = new Edge[sink];

        while (!queue.isEmpty()) {
            int node = queue.poll();

            if (node == sink) {
                break;
            }

            List<Integer> neighbours = adjacencyList.get(node);

            for (int neighbour : neighbours) {
                Edge e = graph[node][neighbour];

                int capacity = e.remainingCapacity();

                if (capacity > 0 && !visisted.contains(e.toNode)) {
                    visisted.add(e.toNode);
                    path[e.toNode-1] = e;
                    queue.offer(e.toNode);
                }
            }
        }

        if (path[sink -1] == null) {
            System.out.println("vi kommer hit");
            return 0;
        }

        return updatePathWithBottleneck(path);
    }

    public int updatePathWithBottleneck(Edge[] path) {
        int bottleneck = Integer.MAX_VALUE;

        for (Edge edge = path[sink -1]; edge != null; edge = path[edge.fromNode-1]) {
            bottleneck = Math.min(bottleneck, edge.remainingCapacity());
        }

        for (Edge edge = path[sink - 1]; edge != null; edge = path[edge.fromNode-1]) {
            int to = edge.toNode;
            int from = edge.fromNode;

            Edge e = graph[to][from];
            Edge e2 = graph[from][to];

            e.increaseFlow(bottleneck);
            e2.decreaseFlow(bottleneck);
        }
        return bottleneck;
    }

    public Edge[][] getGraph() {
        return graph;
    }

    public class Edge {
        private int flow = 0;
        private int capacity;
        private int toNode;
        private int fromNode;

        public Edge  (int fromNode, int toNode, int capacity) {
            this.capacity = capacity;
            this.fromNode = fromNode;
            this.toNode = toNode;
        }

        public void increaseFlow(int flow) {
            if (this.flow + flow <= capacity) {
                this.flow += flow;
            }
        }

        public void decreaseFlow(int flow) {
            if (Math.abs(this.flow - flow) <= capacity) {
                this.flow -= flow;
            }
        }

        public int remainingCapacity() {
            return flow - capacity;
        }

        public int getToNode() {
            return toNode;
        }

        public int getFromNode() {
            return fromNode;
        }

        public String toString() {
            return "Nod 1: " + fromNode + ", Nod 2: " + toNode + ", Capacity: " + capacity + ", Flow: " + flow;
        }
    }

    public static void main(String[] args) {
        MaximumFlow max = new MaximumFlow();

        max.parse();

        Edge[][] graph = max.getGraph();

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                System.out.println(graph[i][j]);
            }
        }

        System.out.println(max.bfs());

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                System.out.println(graph[i][j]);
            }
        }

    }
}
