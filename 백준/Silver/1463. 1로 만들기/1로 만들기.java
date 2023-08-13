import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int[] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new int[N+1];
        dp[0]=dp[1] = 0;
        if(N==2){
            dp[2]=1;
        }
        else if(N >=3){
            dp[3]=dp[2]=1;
        }
        for(int i=4;i<=N;i++){
           dp[i] = dp[i-1]+1; // 2
            if(i%2==0){
              dp[i] = Math.min(dp[i],dp[i/2]+1);
            }
            if(i%3==0){
                dp[i] = Math.min(dp[i],dp[i/3]+1);
            }
        }
        System.out.println(dp[N]);
    }
}
