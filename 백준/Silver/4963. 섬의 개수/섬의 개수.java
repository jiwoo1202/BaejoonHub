
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int w,h;
    static boolean[][] visited;
    static int[][] arr;
    static int[] dy = {-1,1,0,0,-1,-1,1,1};
    static int[] dx = {0,0,-1,1,-1,1,-1,1};
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            result = 0;
            w = Integer.parseInt(st.nextToken()); //5
            h = Integer.parseInt(st.nextToken()); //4
            if(w==0&&h==0){
                break;
            }
            else{
                arr = new int[h][w];
                visited = new boolean[h][w];

                for(int i=0;i<h;i++){
                    st = new StringTokenizer(br.readLine());
                    for(int j=0;j<w;j++){
                        arr[i][j] = Integer.parseInt(st.nextToken());
                    }
                }

                for(int i=0;i<h;i++){
                    for(int j=0;j<w;j++){
                        if(!visited[i][j]&&arr[i][j]==1){
                            visited[i][j] = true;
                            result++;
                            bfs(i,j);
                        }
                    }
                }
                System.out.println(result);
            }
        }
    }
    static void bfs(int y,int x){

        for(int i=0;i<8;i++){
            int nextY = y+dy[i];
            int nextX = x+dx[i];

            if(nextY<0||nextX<0||nextY>=h||nextX>=w||visited[nextY][nextX]||arr[nextY][nextX]==0){
                continue;
            }
            visited[nextY][nextX] = true;
            bfs(nextY,nextX);
        }

    }
}
