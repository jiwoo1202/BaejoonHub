import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb;
	static int N, M;

	static int arr[][];
	static boolean visit[][];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];

		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		Road_Finder();

		sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                sb.append(arr[i][j] + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

	} // End of Main

	static void Road_Finder() {

		// k = 거쳐가는 노드
		for(int k=0; k<N; k++) {
			// i = 출발 노드
			for(int i=0; i<N; i++) {
				// j = 도착 노드
				for(int j=0; j<N; j++) {

					// (i,k) -> (k, j) -> (k,i) 방향 그래프에서 다른 간선과 노드를 통해
					if(arr[i][k] == 1 && arr[k][j] == 1) {
						arr[i][j] = 1;
					}
				}
			}
		}

	} // End of Find()
} // End of class