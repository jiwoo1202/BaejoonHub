import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] time = new int[n][2];
		
		for(int i=0;i<n;i++) {
			time[i][0] = sc.nextInt();
			time[i][1] = sc.nextInt();
		}
		Arrays.sort(time,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1]) {
					return o1[0]-o2[0]; // 오름차순
				} 
				return o1[1]-o2[1]; // 오름차순 
			}	
		});
		int end =-1;
		int result =0;
		for(int i=0;i<n;i++) {
			if(time[i][0]>=end) {
				end = time[i][1];
				result += 1;
			}
		}
		System.out.println(result);
	}
}
