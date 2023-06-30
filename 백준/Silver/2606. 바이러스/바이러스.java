
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n,m;
    static int[] arr;
    static int[][] firstsecond;
    static boolean[] visited;
    static int result;
    static int start;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n= Integer.parseInt(st.nextToken()); // 7
        st =new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken()); //6
        visited = new boolean[n+1];
        firstsecond = new int[n+1][n+1];
        start = 1;
        //값 넣기
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());  //1
            int b = Integer.parseInt(st.nextToken()); // 2
            firstsecond[a][b] = firstsecond[b][a] =  1;
        }
        dfs(1);
        System.out.println(result-1);
    }
    static void dfs(int index){
        visited[index] = true;
        result ++;
        for(int i=1;i<n+1;i++){
            if(firstsecond[index][i] == 1 && !visited[i]){
                dfs(i);
            }
        }

    }
}
