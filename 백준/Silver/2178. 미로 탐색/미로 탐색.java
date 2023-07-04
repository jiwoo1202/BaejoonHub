
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n,m;
    static boolean[][] visited; // 방문
    static int[][] arr; //배열
    static int[] dx = {0,0,-1,1}; // 아래 위 좌 우
    static int[] dy = {-1,1,0,0};
    static int count;
    static int next;
    static Queue<int[]> que = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 4
        m = Integer.parseInt(st.nextToken()); // 6

        visited = new boolean[n][m];
        arr = new int[n][m];

        for(int i=0;i<n;i++){
            String a = br.readLine();
            for(int j=0;j<m;j++){
                arr[i][j] = a.charAt(j)-'0';
            }
        }
        visited[0][0] = true;
        bfs(0,0);
        System.out.println(arr[n-1][m-1]);
    }
    static void bfs(int y,int x){
        que.add(new int[] {y,x});

        while (!que.isEmpty()){
            int[] next = que.poll();
            int nexty = next[0]; //0
            int nextx = next[1]; // 0
            for(int i = 0;i<4;i++){
                int dy2 = nexty+dy[i];
                int dx2 = nextx+dx[i];

                if(dy2<0||dx2<0||dy2>=n||dx2>=m||visited[dy2][dx2]||arr[dy2][dx2]==0){
                    continue;
                }
                visited[dy2][dx2] = true;
                arr[dy2][dx2] = arr[nexty][nextx]+1;
                que.add(new int[]{dy2,dx2});
            }
        }
    }
}
