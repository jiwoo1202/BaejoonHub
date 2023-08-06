import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int n,m;
    static int[][] arr;
    static int result;
    /// 선택해야하는 경우의 찾기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); //5
        m = Integer.parseInt(st.nextToken()); //2

        arr = new int[11][11];

        for(int i=0;i<=n;i++){
            arr[i][i] = 1;
            arr[i][0] = 1;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
            }
        }
        System.out.println(arr[n][m]);
    }
}
