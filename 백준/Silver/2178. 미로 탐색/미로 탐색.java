import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class Main {
    static int n,m;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {0,0,-1,1}; // 아래 위 좌 우
    static int[] dy = {-1,1,0,0};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());
         n = Integer.parseInt(st.nextToken()); // 4
        m = Integer.parseInt(st.nextToken()); // 6

        arr = new int[n][m];
        visited = new boolean[n][m];

        visited[0][0] = true; // 어처피 처음 하나는 true
        //값들을 배열에 넣기
        for(int i=0;i<n;i++){
            String s = br.readLine();
            for(int j=0;j<m;j++){
                arr[i][j] = s.charAt(j) - '0'; // 문자형을 숫자로 바꿀라고 사용함
            }
        }

            bfs(0,0);
        System.out.println(arr[n-1][m-1]);
    }
    public static void bfs(int y,int x){
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[] {y,x}); // 큐에다 넣고

        // 큐에 값이 들어있으면
        while (!que.isEmpty()){
            // 현재값을 저장
           int now[] = que.poll(); // 큐에 넣은 값 빼고
           int currentY = now[0]; //0
           int currentX = now[1]; //0
            ///위아래좌우 찾는 함수
           for(int i=0;i<4;i++){
                int nextY = currentY+dy[i];
                int nextX = currentX+dx[i];
                if(nextY<0||nextX<0||nextY>=n||nextX>=m||visited[nextY][nextX]||arr[nextY][nextX]==0){
                        continue;
                }
                que.add(new int[] {nextY,nextX}); // 다시 넣고
                arr[nextY][nextX] = arr[currentY][currentX]+1; // 만약 1이면 하나씩 더하면서 이동
                visited[nextY][nextX] = true; // 방문 해놓기
           }
        }

    }

}