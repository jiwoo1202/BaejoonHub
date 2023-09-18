import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static int n;
    static int[] dp;
    static long[][] arr;
    static long m = 1000000000;
    static long result;
    public static void main(String[] args) throws IOException {
       Scanner sc= new Scanner(System.in);
       n = sc.nextInt(); // 2
        /// 0~9 까지 되고  345 (-1 +1)
       arr = new long[n+1][10]; ///

        /// 1번째 자리 수
        for(int i=1;i<=9;i++){
            arr[1][i] = 1;
        }

        /// 2번째 자리수
        for(int i=2;i<=n;i++){
            /// 0~9까지 돌림
            for(int j=0;j<=9;j++){
                /// 자리수가 0일 때
                if(j == 0) {
                    arr[i][0] = (arr[i-1][1])%m; //1
                }
                else if(j==9){
                    arr[i][9] = (arr[i-1][8])%m; //
                }
                else{
                    arr[i][j] = (arr[i-1][j-1]+arr[i-1][j+1])%m;
                }
            }
        }

        for(int i=0;i<10;i++){
            result += arr[n][i];
        }
        System.out.println(result%m);
    }
}
