import java.util.Scanner;
 
public class Main {
 
	static int[][] arr;
	static Integer[][] dp;
	static int N;
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		N = in.nextInt();
 
		arr = new int[N][N];
		dp = new Integer[N][N];
 
        
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i + 1; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
	
		for (int i = 0; i < N; i++) {
			dp[N - 1][i] = arr[N - 1][i];
		}
 
		System.out.println(find(0, 0));
 
	}
 
	
	static int find(int depth, int idx) {
	
		if(depth == N - 1) return dp[depth][idx];
 
		
		if (dp[depth][idx] == null) {
			dp[depth][idx] = Math.max(find(depth + 1, idx), find(depth + 1, idx + 1)) + arr[depth][idx];
		}
		return dp[depth][idx];
 
	}
}