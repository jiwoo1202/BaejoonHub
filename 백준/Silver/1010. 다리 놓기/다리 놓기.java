import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int test,n,m;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new int[30][30];
        for(int i=0;i<30;i++){
            arr[i][i] =1;
            arr[i][0] =1;
        }
        /// 어처피 1이면 경우의 수는 하나니깐
        for(int i=1;i<30;i++){
            for(int j=1;j<30;j++){
                arr[i][j] = arr[i-1][j-1]+ arr[i-1][j];
            }
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        test = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<test;i++){
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            sb.append(arr[m][n]).append('\n');
        }
        System.out.println(sb);

    }
}
