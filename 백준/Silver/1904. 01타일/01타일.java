import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    static int m;
    static int[] dp;

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int k = 15746;
       m = Integer.parseInt(st.nextToken()); ///4

       dp = new int[m+1];
       dp[1] = 1;
       if(m>=2)
       {
           dp[2] = 2;
       }
       if(m>=3){
           for(int i=3;i<=m;i++){
               dp[i] = (dp[i-2]+dp[i-1])%k;
           }
       }
        System.out.println(dp[m]);
    }
}
