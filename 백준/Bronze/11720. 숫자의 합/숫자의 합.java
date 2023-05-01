import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); // 한줄
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());   
		String[] a = bufferedReader.readLine().split("");		
	
		int result = 0;
		for(int i=0;i<a.length;i++){
			result += Integer.parseInt(a[i]);
		}
		System.out.println(result);
	
	}
}
