import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		int start_idx = 1;
		int end_idx = 1;
		int sum = 1;
		
		while(end_idx !=N) {
			if(sum==N) {
				count++; // 1 2
				end_idx++; // 6 7 
				sum = sum+end_idx; // 21 22 
			}
			else if(sum<N) {
				end_idx++; //2 3 4 5 8 9 10
				sum = sum+end_idx;// 3 6 10 15 18   
			}
			else if(sum>N) {
				sum = sum-start_idx; // 20 18 15 21 16 10 12 11  
				start_idx++; //2 3 4 5 6 7 8
			}
			
			
		}
		System.out.println(count);
	}
}
