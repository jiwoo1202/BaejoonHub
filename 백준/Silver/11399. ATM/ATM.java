import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
		
	public static void main(String[] args)throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arr2 =new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		int result = 0;
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			count += arr[i];
			arr2[i] = count;
		}
		for(int i=0;i<n;i++) {
			result += arr2[i];
		}
		System.out.println(result);
	}
}
