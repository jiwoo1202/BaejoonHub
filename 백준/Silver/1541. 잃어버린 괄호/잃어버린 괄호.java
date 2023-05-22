import java.awt.Taskbar.State;
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
import java.util.StringTokenizer;

public class Main {
	static int answer = 0;
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		String[] a = n.split("-");
		
		
		for(int i =0;i<a.length;i++) {
			int temp = sums(a[i]);
			if(i==0) {
				answer = answer+temp; 
			}
			else {
				answer = answer-temp;
			}
		}
		System.out.println(answer);
		
	}
	static int sums(String a) {
		int sum =0;
		String[] sum1 = a.split("[+]");
		for(int i=0;i<sum1.length;i++) {
			sum+= Integer.parseInt(sum1[i]);
		}
		return sum;
		
	}
}
