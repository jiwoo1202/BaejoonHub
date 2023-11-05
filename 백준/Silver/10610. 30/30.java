import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String k = scan.next();
		int arrInt[] = new int[k.length()];
		int arrTotalCount = 0;
		for (int i = 0; i < k.length(); i++) {
			arrInt[i] = k.charAt(i) - 48;
			arrTotalCount += arrInt[i];
		}
		Arrays.sort(arrInt);
		if ((arrTotalCount % 3 == 0)&&(arrInt[0]==0)) {
			for(int i = k.length()-1;i>-1;i--) {
				System.out.print(arrInt[i]);
			}
		} else {
			System.out.println(-1);
		}

	}
}