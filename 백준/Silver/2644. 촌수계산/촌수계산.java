import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int n,x,y,m;
    static int[][] arr;
    static boolean[] visited;
    static int result;
    static int find = 0;
    static int count = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 9
        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken()); // 7
        y = Integer.parseInt(st.nextToken()); //3

        m = Integer.parseInt(br.readLine()); // 7

        arr = new int[n+1][n+1];
        visited = new boolean[n+1];
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }

        dfs(x,y,0);
        System.out.println(count);
    }
  static void dfs(int start, int end,int counts){
        visited[start] = true;
      if(start==end){
          find = 1;
          count = counts;
          return;
      }
          for(int i=1;i<arr.length;i++){
              if(!visited[i]&&arr[start][i]==1){
                  dfs(i,end,counts+1);

              }
      }

  }
}
