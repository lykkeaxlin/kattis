package weakvertices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class WeakVertices {
    private List<Integer> weakVertices = new ArrayList<>();
    private Map<Integer, List<Integer>> adjacencyMap = new HashMap<>();
    private int[][] graph;

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            String[] line;

            while (!(line = br.readLine().split(" "))[0].equals("-1")) {

                int n = Integer.parseInt(line[0]);
                graph = new int[n][n];

                List<Integer> neighbours = new ArrayList<>();

                for (int i = 0; i < n; i++) {
                    String[] input = br.readLine().split(" ");


                    for (int j = 0; j < n; j++) {

                        int x = Integer.parseInt(input[j]);
                        graph[i][j] = x;

                        if (x == 1) {
                            neighbours.add(j);
                            adjacencyMap.put(i, neighbours);
                        }

                    }
                    neighbours = new ArrayList<>();
                }
                printMatrix(graph);
                System.out.println(" ");
                printAdjacencyMap();
                checkVertices();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void checkVertices() {
        for (int i = 0; i < graph.length; i++) {
            isPartOfTriangle(i);
        }

        System.out.println(weakVertices);
    }

    private boolean isPartOfTriangle(int node) {

        if (adjacencyMap.containsKey(node) && adjacencyMap.get(node).size() > 1) {

            List<Integer> neighbours = adjacencyMap.get(node);
            System.out.println("neigh " + neighbours);

            int i = 0;
            int n1 = 0;
            int n2 = 0;
            int counter = 0;

            n1 = neighbours.get(i);

            while (i + 1 <= adjacencyMap.get(n1).size() && counter < neighbours.size()) {

                n2 = neighbours.get(i+1);

                System.out.println("(" + n1 + "," + n2 + ")");
                System.out.println("weak " + weakVertices);
                if (areNeighbours(n1,n2)) {
                    return true;
                }

                i++;
                counter++;
            }
            i = counter;
        } else {
            weakVertices.add(node);
        }
        return false;
    }


    public boolean areNeighbours(int n1, int n2) {
        return graph[n1][n2] == 1;
    }


    public void printAdjacencyMap() {
        for (int i = 0; i < adjacencyMap.size(); i++) {
            System.out.println(adjacencyMap.get(i));
        }
    }



    public void printMatrix(int[][] graph) {

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                System.out.print(graph[i][j]);
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        WeakVertices weakVertices = new WeakVertices();
        weakVertices.parse();
    }
}
