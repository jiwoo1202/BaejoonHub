import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = n/10;
		int b = n%10;
		int cnt=0;
		
		while(true) {
			int sumright = (a+b)%10;
			int number =b*10+sumright;
			cnt++;
			if(number==n) {
				System.out.println(cnt);
				break;
			}
			a = number/10;
			b = number%10;
	}
}
}
