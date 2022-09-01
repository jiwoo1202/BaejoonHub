import java.util.*;

    class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		float[] number = new float[N];
		float max = 0;
		
		for(int i=0;i<number.length;i++) {
			number[i] = sc.nextInt();  
			if(number[i]>max) {
				max = number[i];
			}
		}
		float avg = 0;
		
		for(int i=0;i<number.length;i++) {
			avg += (number[i]/max*100);
		}
		System.out.println(avg/N);
	}
	}


