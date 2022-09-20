import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int k=0;k<num-i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=num-1;i>0;i--) {
			for(int k=0;k<num-i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
			}
			
		}
		
	


