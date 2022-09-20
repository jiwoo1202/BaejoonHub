import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		int day = sc.nextInt();
		String[] days ={"SUN","MON","TUE","WED","THU","FRI","SAT"};
		
		for(int i=0;i<month-1;i++) {
			day += months[i]; 
		}
		
		System.out.println(days[day%7]);
	}	
}
