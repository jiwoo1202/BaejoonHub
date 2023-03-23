import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 입력받음
		StringTokenizer st = new StringTokenizer(bf.readLine()); 
		
		int su = Integer.parseInt(st.nextToken());
		int quizno = Integer.parseInt(st.nextToken());
		
		int[] S = new int[su+1]; // 6칸짜리 
		st = new StringTokenizer(bf.readLine());
		
		for(int i=1;i<=su;i++) {
			S[i] = S[i-1]+ Integer.parseInt(st.nextToken());
		}
		
		for(int q=0;q<quizno;q++) {
			st = new StringTokenizer(bf.readLine());
			int i = Integer.parseInt(st.nextToken()); //1
			int j = Integer.parseInt(st.nextToken()); // 3
			System.out.println(S[j]-S[i-1]);
		}
		
	}

}
