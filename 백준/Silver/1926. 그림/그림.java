import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static int n,m;
    static int[][] arr;
    static boolean[][] visited;
    static int max;
    static int cnt;
    static int area;
    static int[] dx = {0,0,-1,1}; // 아래 위 좌 우
    static int[] dy = {-1,1,0,0};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());
         n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visited = new boolean[n][m];
        //값들을 배열에 넣기
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j]&&arr[i][j]==1){
                    cnt = 1;
                    visited[i][j] = true;
                    dfs(i,j);
                    area++;
                }

            }
        }
        System.out.println(area);
        System.out.println(max);
    }
    public static void dfs(int y,int x){
        max = Math.max(cnt,max); //1

        for(int i=0;i<4;i++){
            int ny = y+dy[i];
            int nx = x+dx[i];

            if(ny<0||nx<0||nx>m-1||ny>n-1||visited[ny][nx]||arr[ny][nx]==0){
                continue;
            }
            visited[ny][nx] = true;
            cnt++;
            dfs(ny,nx); // 방문안한 1이 있는쪽으로 이동
        }



    }

}