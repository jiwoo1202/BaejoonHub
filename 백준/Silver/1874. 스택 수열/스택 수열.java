import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int N = sc.nextInt(); //8
		int[] A = new int[N]; // 4 3 6 8 7 5 2 1
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		StringBuffer sb = new StringBuffer();
		int num =1;
		boolean result = true;
		
		for(int i=0;i<A.length;i++) {
			int su = A[i];
			if(su>=num) {
				while(su>=num){
					stack.push(num++);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			}
			else {
				int n = stack.pop();
				if(n>su) {
					System.out.println("NO");
					result =false;
					break;
				}
				else {
					sb.append("-\n");
				}
			}
		}
	if(result) System.out.println(sb.toString());
	}
}
