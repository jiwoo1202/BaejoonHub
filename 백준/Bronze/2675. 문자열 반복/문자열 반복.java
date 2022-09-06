import java.util.Scanner;
 class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int t = sc.nextInt();
		
		
	for(int i =0;i<t;i++) {
		int num = sc.nextInt();
		String arr = sc.next();
			for(int j=0;j<arr.length();j++) {
				for(int k=0;k<num;k++) {
					System.out.print(arr.charAt(j));
		}
	}
				System.out.println();
}
}
}