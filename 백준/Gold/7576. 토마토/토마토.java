import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int m,n;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dy = {-1,1,0,0};
    static int[] dx = {0,0,-1,1};
    static Queue<int[]> que = new LinkedList<>();
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken()); //6
        n = Integer.parseInt(st.nextToken()); //4
        arr = new int[n][m];
        visited = new boolean[n][m];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j]==1){
                    que.add(new int[]{i,j});
                }
            }
        }
        bfs();
        if(count !=-1){
            System.out.println(count-1);
        }
        else{
            System.out.println(count);
        }
    }
    static void bfs(){
        while (!que.isEmpty()){
            int[] a = que.poll();
            for(int i=0;i<4;i++){
                int nexty = a[0] + dy[i];
                int nextx = a[1] + dx[i];

                if(nextx<0||nexty<0||nexty>=n||nextx>=m||visited[nexty][nextx]||arr[nexty][nextx]==1||arr[nexty][nextx]==-1){
                    continue;
                }
                visited[nexty][nextx] = true;
                arr[nexty][nextx] = arr[a[0]][a[1]]+1;
                que.add(new int[]{nexty,nextx});
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    count = -1;
                    return;
                }
                else{
                    if(arr[i][j]>max){
                        max = arr[i][j];
                        count = arr[i][j];
                    }
                }
            }
        }
    }
}
