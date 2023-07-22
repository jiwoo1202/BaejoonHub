import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static Character[][] arr;
    static Character[][] arr2;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static boolean[][] visited;
    static int count;
    static int count2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new Character[n][n];
        arr2 =new Character[n][n];
        visited = new boolean[n][n];
        // 배열 넣기
        for(int i=0;i<n;i++){
            String a = br.readLine();
            for(int j=0;j<n;j++){
                arr[i][j] = a.charAt(j);
                if(arr[i][j]=='R'||arr[i][j]=='G'){
                    arr2[i][j] = 'R';
                }
                else{
                    arr2[i][j] = a.charAt(j);
                }
            }
        }
/// 기본
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    visited[i][j] = true;
                    dfs(i, j, arr[i][j],arr);
                    count++;
                }
            }
        }
        //적록색약
        visited = new boolean[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j]){
                    visited[i][j] = true;
                    dfs(i,j,arr2[i][j],arr2);
                    count2++;
                }
            }
        }
        System.out.print(count+ " "+count2);
        
    }

    static void dfs(int y, int x, char startAlpabat,Character[][] arr){

        for(int i=0;i<4;i++){
            int nexty = y + dy[i];
            int nextx = x + dx[i];

            if(nexty<0||nextx<0||nextx>=n||nexty>=n||visited[nexty][nextx]||arr[nexty][nextx]!=startAlpabat){
                continue;
            }
            visited[nexty][nextx]= true;
            dfs(nexty,nextx,startAlpabat,arr);

        }

    }
}
