import java.util.*;

 class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
	
		for(int i =0;i<N;i++) {
			double sum =0;
			int N1 = sc.nextInt();
			int[] arr = new int[N1];
			
				for(int j=0;j<N1;j++) {
					arr[j]= sc.nextInt();
					sum += arr[j];
			}
			double avg = sum/N1;
			double cnt=0;
			for(int k=0;k<N1;k++) {
				if(avg<arr[k]) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%\n" ,(cnt/N1)*100);
	}
}
}