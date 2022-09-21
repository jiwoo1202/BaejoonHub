

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=num-1;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i*2;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
