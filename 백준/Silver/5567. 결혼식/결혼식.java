
import java.util.*;
import java.io.*;

public class Main {
	static List<List<Integer>> nodeList;
	static int dist[];
	static boolean visit[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		nodeList = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			nodeList.add(new ArrayList<>());
		}
		dist = new int[N + 1];
		visit = new boolean[N + 1];

		while (M-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int parent = Integer.parseInt(st.nextToken());
			int son = Integer.parseInt(st.nextToken());

			nodeList.get(parent).add(son);
			nodeList.get(son).add(parent);
		}

		graphSearch(1);

		int resultCount = 0;
		for (int i = 2; i <= N; i++) {
			if (dist[i] <= 3 && dist[i] > 0) {
				resultCount++;
			}
		}

		System.out.print(resultCount);
	} // End of main

	private static void graphSearch(int startNum) {
		Queue<Integer> que = new LinkedList<>();
		que.offer(startNum);
		dist[startNum] = 1;

		while (!que.isEmpty()) {
			int num = que.poll();

			for (int friendNum : nodeList.get(num)) {
				if(dist[friendNum] == 0) {
					dist[friendNum] = dist[num] + 1;
					que.offer(friendNum);
				}
			}

		}

	} // End of graphSearch
} 