import java.util.*;
import java.math.*;
public class Main {
	
	static int dp[],cost[] ;
	
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		//dp 배열과 비용배열 선언
		dp = new int[n+1];
		cost = new int[n+1];
        
		for(int i=1;i<=n;i++) {
			cost[i] = sc.nextInt();
		}
		
		dp[1] = cost[1]; // dp[1]은 항상 cost[1]로 초기화 된다. 이전에 더해진 값이 없기 때문
		
		for(int i=2;i<=n;i++) { //두 번째 숫자를 기준으로 n까지 반복
			dp[i] = cost[i]; // 우선 자신의 값을 dp에 저장해 둔다.
			for(int j=1;j<i;j++) { // 첫 번째 부터 i이전 까지 비교를 위한 반복
				if(cost[i]>cost[j]) { // 기준값이 더 큰 경우
					dp[i] = Math.max(dp[j]+cost[i],dp[i]); // 증가 수열이므로 dp값 갱신
				}
			}
		}
		int max = Integer.MIN_VALUE;
		for(int i=1;i<=n;i++) {
			if(dp[i]>max) {
				max = dp[i];
			}
		}
		System.out.println(max);
	}
	
}