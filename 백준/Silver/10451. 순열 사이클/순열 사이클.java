

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int t; // 테스트 갯수
    static int m; // 크기
    static boolean[] visited; // 방문
    static int result;
    static int[] arr1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());
        t = Integer.parseInt(st.nextToken()); // 2
        for(int j=0;j<t;j++) {
            result =0;
            m = Integer.parseInt(br.readLine()); // 8
            st = new StringTokenizer(br.readLine());
            arr1 = new int[m + 1];
            visited = new boolean[m + 1];
            for (int i = 1; i < m + 1; i++) {
                arr1[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 1; i < m + 1; i++) {
                if (!visited[i]) {
                    result++;
                    dfs(i);
                }
            }
            System.out.println(result);
        }
    }
    public static void dfs(int index){
        // 방문했으면 아웃
        if(visited[index]){
            return;
        }
        visited[index] = true;
        // 다음번의 배열에 위치의 값이 false면 한번더 돌기
        int next = arr1[index];
        dfs(next);

    }
}
