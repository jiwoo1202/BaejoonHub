import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static boolean[][] visited;
    static int[] dy = {-1,1,0,0};
    static int[] dx = {0,0,-1,1};
    static int[][] arr;
    static int count;
    static int max;
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());

        arr = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
               if(!list.contains(arr[i][j])){
                   list.add(arr[i][j]);
               }
            }
        }
        int max = Integer.MIN_VALUE/16; // 최대값 초기화
       for(int num: list){
           int count = 0;
           visited = new boolean[n][n];
           for(int i=0;i<n;i++){
               for(int j=0;j<n;j++){
                 if(!visited[i][j]&&arr[i][j]>=num){
                     dfs(i,j,num);
                     count++;
                 }
               }
           }
           max = Math.max(max,count);
       }
        System.out.println(max);
    }

    static void dfs(int y,int x,int num){

        for(int i=0;i<4;i++){
            int nexty = y+dy[i];
            int nextx = x+dx[i];

            if(nexty<0||nextx<0||nexty>=n||nextx>=n||visited[nexty][nextx]||arr[nexty][nextx]<num){
                continue;
            }
            visited[nexty][nextx] = true;
            dfs(nexty,nextx,num);
        }
    }
}
