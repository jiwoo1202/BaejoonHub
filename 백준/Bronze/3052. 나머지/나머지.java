import java.util.*;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[10];
		boolean b;
		int cnt=0;
		
		for(int i=0;i<10;i++) {
			number[i] = sc.nextInt() % 42;
		}
		for(int i=0;i<10;i++) {
			b= false;
			for(int j=i+1;j<10;j++) {
				if(number[i]==number[j]) {
					b=true;
					break;
				}	
			}
			if(b==false) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
	}
	}

