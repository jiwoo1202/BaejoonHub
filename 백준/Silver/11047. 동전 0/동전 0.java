import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//10
		int k = sc.nextInt(); // 4200
		int[] arr = new int[n];
		int count = 0;
		int a = 0; 
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		a = k;
		for(int i=n-1;n>=0;i--){
			if(arr[i]<=k) {
				count += a/arr[i];
				a = k%arr[i];//
				if(a==0) {
					break;
				}
			}
		}
		System.out.println(count);
		
	}
}
