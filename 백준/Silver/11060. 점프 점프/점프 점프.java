import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static int n;
    static int[] arr;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 10
        arr = new int[n+1];
        dp = new int[n+1];

        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.fill(dp,Integer.MAX_VALUE-1); // dp에 최대값 채우기
        dp[1] = 0;
       // n = 10
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<arr[i]+1+i;j++){
                if(j>n) break;
                dp[j] = Math.min(dp[j],dp[i]+1);
            }
        }
        if(dp[n]==Integer.MAX_VALUE-1){
            System.out.println(-1);
        }
        else{
            System.out.println(dp[n]);
        }
    }
}
