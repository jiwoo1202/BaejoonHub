import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int m,n,k;
    static int[][] arr;
    static boolean[][] visited;
    static int count;
    static int counts;
    static int[] dy = {-1,1,0,0};
    static int[] dx = {0,0,-1,1};
    static List<Integer> lists = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken()); //5
        n = Integer.parseInt(st.nextToken()); // 7
        k = Integer.parseInt(st.nextToken()); //3

        arr = new int[m+1][n+1];
        visited = new boolean[m+1][n+1];

        for(int i=0;i<k;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int j=x;j<x2;j++){
              for(int z=y;z<y2;z++){
                  arr[z][j] = 1;
                  visited[z][j] = true;
              }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j]&&arr[i][j]==0){
                    visited[i][j] = true;
                    counts = 0;
                    counts++;
                    dfs(i,j);
                    count++;
                    lists.add(counts);
                }
            }
        }
        System.out.println(count);
        Collections.sort(lists);
        for(int i: lists){
            System.out.print(i+ " ");
        }
    }
    static void dfs(int y, int x){

        for(int i=0;i<4;i++){
            int nextY = y+dy[i];
            int nextX = x+dx[i];
            if(nextY<0||nextX<0||nextY>=m||nextX>=n||visited[nextY][nextX]||arr[nextY][nextX]==1){
                continue;
            }
            visited[nextY][nextX] = true;
            counts++;
            dfs(nextY,nextX);
        }
    }
}
