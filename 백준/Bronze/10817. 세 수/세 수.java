import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer[] num = new Integer[3];
		
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num,Collections.reverseOrder() );
		System.out.println(num[1]);
			
	}
}
