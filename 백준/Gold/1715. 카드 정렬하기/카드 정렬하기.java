import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//3
		int[] arr = new int[n]; // 10 20 40
		PriorityQueue<Integer> pq  = new PriorityQueue<>();
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			pq.add(arr[i]);
		}
		int a = 0;
		int b = 0;
		int sum =0;
		while(pq.size()!=1) {
			a = pq.remove(); //10
			b = pq.remove(); // 20
			sum += a+b; //30
			pq.add(a+b);
			
		}
		System.out.println(sum);
	}
}
