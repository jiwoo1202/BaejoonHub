import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

 public class Main {
    static int n; // 집에 단지 수
    static int[][] arr; // 배열
    static boolean[][] visited; // 방문
    static int apartNum; // 아파트 갯수
    static int[] dx = {0,0,-1,1}; // 아래 위 좌 우
    static int[] dy = {-1,1,0,0};
    static int[] apart;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 7

        arr = new int[n][n];
        visited = new boolean[n][n];
        apart = new int[n*n];
        // 1. 배열에 값 넣어주기
        for(int i=0;i<n;i++){
            String str = br.readLine();
            for(int j=0;j<n;j++){
                arr[i][j] = Character.getNumericValue(str.charAt(j));
             }
        }
        // dfs 검사
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                if(!visited[i][j] && arr[i][j]==1){
                    apartNum++;
                    dfs(i,j);
                }
            }
        }
        Arrays.sort(apart);
        System.out.println(apartNum);

        for(int i:apart){
            if(i!= 0){
                System.out.println(i);
            }
        }
    }
    //dfs
    static void dfs(int y, int x){
        visited[y][x] = true;
        apart[apartNum]++;
        for(int i=0;i<4;i++){
            int y2 = y+dy[i];
            int x2 = x+dx[i];

            if(x2<0||y2<0||x2>=n||y2>=n||visited[y2][x2]||arr[y2][x2]==0){
                continue;
            }
            dfs(y2,x2);
        }

    }
}