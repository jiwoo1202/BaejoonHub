
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n,m;
    static boolean[] visited; // 방문
    static int[][] arr; //배열
    static int count;
    static int next;
    static Queue<int[]> que = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 7
        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken()); // 6

        visited = new boolean[n+1];
        arr = new int[n+1][n+1];

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b]= arr[b][a] =1;
        }

        dfs(1);
        System.out.println(count);
    }
    static void dfs(int start){
        visited[start] = true;
        for(int i=1;i<n+1;i++){
            if(!visited[i]&&arr[start][i]==1){
                visited[i] = true;
                count++;
                dfs(i);
            }
        }
    }
}
