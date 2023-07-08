import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int t,m,n,k;
    static boolean[][] visited;
    static int[][] arr;
    static int count;
    static int[] dy = {-1,1,0,0};
    static int[] dx = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());

        t = Integer.parseInt(st.nextToken()); // 2

        for(int k2=0;k2<t;k2++){
            st = new StringTokenizer(br.readLine());
            count = 0;
            m = Integer.parseInt(st.nextToken()); // 10
            n = Integer.parseInt(st.nextToken());//8
            k =Integer.parseInt(st.nextToken()); //17

            arr = new int[n][m];
            visited = new boolean[n][m];

            for(int i=0;i<k;i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken()); //x
                int b = Integer.parseInt(st.nextToken()); //y

                arr[b][a] = 1;
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(!visited[i][j]&&arr[i][j]==1){
                        visited[i][j] = true;
                        count ++;
                        dfs(i,j);
                    }
                }
            }
            System.out.println(count);
         }
        }

    static void dfs(int y, int x){

        for(int i=0;i<4;i++){
            int nextY = y+dy[i];
            int nextX = x+dx[i];

            if(nextY<0||nextX<0||nextY>=n||nextX>=m||visited[nextY][nextX]||arr[nextY][nextX]==0){
                continue;
            }
            visited[nextY][nextX] = true;
            dfs(nextY,nextX);

        }
    }
}
