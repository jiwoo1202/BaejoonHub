import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static int t;
    static int[] dp;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        t = Integer.parseInt(st.nextToken());

        arr = new int[t+1];
        dp = new int[t+1];
        for(int i=1;i<=t;i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = arr[1];
        if(t>1){
            dp[2] = arr[1] + arr[2];
        }

        for(int i=3;i<t+1;i++){
            dp[i] = Math.max(dp[i-1],Math.max(dp[i-2]+arr[i],dp[i-3]+arr[i-1]+arr[i]));
        }
        System.out.println(dp[t]);
    }
}
