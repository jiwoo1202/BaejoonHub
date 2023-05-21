import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int zero = 0; 
		int one =0;
		PriorityQueue<Integer> pluspq  = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> minuspq  = new PriorityQueue<>();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			if(a==0) {
				zero+= 1;
			}
			else if(a==1) {
				one += 1;
			}
			else if(a>1) {
				pluspq.add(a);
			}
			else {
				minuspq.add(a);
			}
		}
		int plusResult = 0;
		int minusResult = 0;
		int result = 0;
		while(pluspq.size()>=2) {
			plusResult += (pluspq.remove()*pluspq.remove());
		}
		if(pluspq.size()==1) {
			plusResult+= pluspq.remove();
		}
		while(minuspq.size()>=2) {
			minusResult += (minuspq.remove()*minuspq.remove());
		}
		if(minuspq.size()==1) {
			if(zero!=0) {
				minusResult+= minuspq.remove()*0;
			}
			else {
				minusResult+= minuspq.remove();	
			}
		}
		
		result = plusResult+minusResult;
		System.out.println(result+one);
	}
}
