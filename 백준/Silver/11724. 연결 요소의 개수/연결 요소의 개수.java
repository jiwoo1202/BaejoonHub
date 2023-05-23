import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] a;
	static boolean visited[];
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());//6
		int m = Integer.parseInt(st.nextToken()); //5
		
		a = new ArrayList[n+1];
		visited = new boolean[n+1];
		
		for(int i=1;i<n+1;i++) {
			a[i] = new ArrayList<Integer>(); // 정수형 초기화
		}
		
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			
			int s = Integer.parseInt(st.nextToken());
			int e= Integer.parseInt(st.nextToken());
			
			a[s].add(e);
			a[e].add(s);
		}
		int count = 0;
		
		for(int i=1;i<n+1;i++) {
			if(!visited[i]) {
				count++;
				dfs(i);
			}
		}
		System.out.println(count);
	}
	static void dfs(int j) {
		
		if(visited[j]) {
			return;
		}
		visited[j] = true;
		for(int i: a[j]) {
			if(visited[i]==false) {
				dfs(i);
			}
		}
	}
	
}
