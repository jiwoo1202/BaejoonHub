import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String N = sc.nextLine();
		
		
		String str [] = N.trim().split(" ");
		
		int cnt=0;
		
		for(int i=0; i<str.length;i++) {
			if(str[i] != "") {
				cnt++;
			}
		}
        System.out.println(cnt);
}
	
}
