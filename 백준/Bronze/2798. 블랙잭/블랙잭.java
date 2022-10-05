
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		card(arr,N,M);
		
		System.out.println(card(arr,N,M));
	}
	// 5 6 7 8 9 10
	static int card(int[] arr,int N,int M) {
		
		int result = 0;
		
		for(int i=0;i<N-2;i++) {
			
			for(int j= i+1;j<N-1;j++) {
				
				for(int k= j+1;k<N;k++) {
					
					int sum = arr[i]+arr[j]+arr[k];
					
					if(M == sum) {
						return sum;
					}
					// 합계가 이전의 합계보다 크고 M보다 작은 경우
					else if(result<sum && sum<M) {
						result = sum;
					}
				}
			}
		}
			return result;
	}
	
	
	
}
