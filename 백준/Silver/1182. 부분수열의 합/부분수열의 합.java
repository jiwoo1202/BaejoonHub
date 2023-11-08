import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static int N,S;
    static int[] num;
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        num = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0,0);
        if(S==0){
            System.out.println(result-1);
        }
        else{
            System.out.println(result);
        }

    }
    static void dfs(int depth,int sum){
        /// 깊이 탐색 다한 횟수
        if(depth ==N){
            /// 탐색 다 한 후 값이 s랑 맞으면 출력
            if(sum==S){
                result ++;
            }
            return;
        }

        dfs(depth+1,sum); /// 그냥 기본
        dfs(depth+1,sum + num[depth]); //더 한것

    }
}
