
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by emmaperez on 4/23/16.
 */
public class TopologicalSort {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String line;
        int count = scan.nextInt();
        boolean graph[][] = new boolean[count][count];

        scan.nextLine();
        while ((line = scan.nextLine()).length() > 0) {
            Scanner lineScan = new Scanner(line);
            while (lineScan.hasNext()) {
                int source = lineScan.nextInt();
                int destination = lineScan.nextInt();
                graph[source][destination] = true;
            }
        }
        int[] indegrees = new int[count];

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                if (graph[i][j] == true) {
                    indegrees[j] = indegrees[j] + 1;
                }
            }
        }
        ArrayList<Integer> results = new ArrayList<>();

        int v = 100;
        while (v != -1) {
            v = -1;
            for (int w = 0; w < count && v == -1; w++) {
                if (indegrees[w] == 0) {
                    v = w;
                    results.add(v);
                    for (int k = 0; k < count; k++) {
                        indegrees[v] = -1;
                        if (graph[w][k]) {
                            indegrees[k] = indegrees[k] - 1;
                        }
                    }
                }
            }
        }
        if (results.size() != count) {
            System.out.println("Cycle detected");
        } else {

            System.out.println(results);
        }
    }
}
