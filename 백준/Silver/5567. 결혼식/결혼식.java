import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n,m,max;
    static int[] visited;
    static List<Integer>[] list;
    static Queue<Integer> que = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m  = Integer.parseInt(br.readLine());

        list = new ArrayList[n+1];
        visited = new int[n+1];

        for(int i=1;i<=n;i++){
            list[i] = new ArrayList<>();
        }
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }
        bfs();
        System.out.println(max);
    }

   static public void bfs(){
        que.add(1);
        visited[1]++;
        while (!que.isEmpty()){
            int next = que.poll(); // 1

            ///친구의 친구까지
            if(visited[next]>=3){
                break;
            }
                //2 3
            for(int i : list[next]){
                if(visited[i]==0){
                    visited[i] = visited[next]+1;
                    que.add(i);
                 
                    max ++;
                }
            }
        }

    }
}
