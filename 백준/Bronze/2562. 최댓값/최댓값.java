import java.util.*;
 class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[9];
		int cnt =0;
		
		
		for(int i=0;i<number.length;i++) {
			number[i] = sc.nextInt();		
		}
		int max = number[0];
		
		for(int i=0;i<number.length;i++) {
			if(max<number[i]) {
				max = number[i];
			}
		}
		for(int i=0;i<number.length;i++) {
			cnt++;
			if(max == number[i]) {
				break;
			}
		}
	System.out.println(max);
	System.out.println(cnt);

	}
	}


