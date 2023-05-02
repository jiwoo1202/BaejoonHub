import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] score = new int[N];
		int max = 0;
		int sum = 0;
		double a = 0.0;
		double b = 0.0;
		double total = 0.0;
		for(int i=0;i<N;i++) {
			score[i] = sc.nextInt();
			sum += score[i];
			if(max<score[i]) {
				max = score[i];
			}
		}
		a = sum/(double)N;
		b = a/max;
		total = b*100;
			
		System.out.println(total);
		
	}
}
