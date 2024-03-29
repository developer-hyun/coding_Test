import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static boolean[] visit = new boolean[9];


    public  static void bfs(int x) {
        visit[x] = true;
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);
        while (!q.isEmpty()){
           int seq = q.poll(); //1을뺌.
            System.out.println(seq + " ");
            for(int i=0 ; i<graph.get(seq).size(); i++) {
                int y = graph.get(seq).get(i);
                if ( ! visit[y]) {
                    q.offer(y);
                    visit[y] =true;
                }
            }
        }

    }


    public static void main(String[] args) {

        for(int  i=0 ; i<9; i++){
            graph.add(new ArrayList<Integer>());
        }
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);
        graph.get(2).add(1);
        graph.get(2).add(7);
        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);
        graph.get(4).add(3);
        graph.get(4).add(5);

        // 노드 5에 연결된 노드 정보 저장
        graph.get(5).add(3);
        graph.get(5).add(4);

        // 노드 6에 연결된 노드 정보 저장
        graph.get(6).add(7);

        // 노드 7에 연결된 노드 정보 저장
        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        // 노드 8에 연결된 노드 정보 저장
        graph.get(8).add(1);
        graph.get(8).add(7);
        bfs(1);

    }

}
