import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static BufferedReader br;
	static StringTokenizer st;
	static int T, l;
	static int[][] map;
	static boolean[][] isVisited;
	static Point start, end;
	static int[][] dir = {{-1, -2}, {-2, -1}, {-2, 1}, {-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}};

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// System.setIn(new FileInputStream("./input.txt"));
		br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		for(int t = 0; t < T; t++) {
			l = Integer.parseInt(br.readLine());
			map = new int[l][l];
			isVisited = new boolean[l][l];
			
			st = new StringTokenizer(br.readLine());
			start = new Point(Integer.parseInt(st.nextToken()),
            							Integer.parseInt(st.nextToken()), 0);
			st = new StringTokenizer(br.readLine());
			end = new Point(Integer.parseInt(st.nextToken()),
            							Integer.parseInt(st.nextToken()), 0);
			
			bfs(start);
			
		}

	}
	
	static void bfs(Point p) {
		Queue<Point> q = new LinkedList<>();
		q.add(p);
		isVisited[p.r][p.c] = true;
		
		while(!q.isEmpty()) {
			Point temp = q.poll();
			int tempR = temp.r;
			int tempC = temp.c;
			int cnt = temp.cnt;
			
			if(tempR == end.r && tempC == end.c) { // 목표점에 도착
				System.out.println(temp.cnt);
				return;
			}
			
			for(int i = 0; i < 8; i++) { // 8방 탐색
				int nr = tempR + dir[i][0];
				int nc = tempC + dir[i][1];
				
				if(nr >= 0 && nr < l && nc >= 0 && nc < l && !isVisited[nr][nc]) {
					q.add(new Point(nr, nc, cnt + 1));
					isVisited[nr][nc] = true;
				}
			}
			
		}
		
	}
	
	static class Point { // 좌표 클래스에 정답을 구하기 위한 cnt 추가
        int r, c, cnt;

        public Point(int r, int c, int cnt) {
            this.r = r;
            this.c = c;
            this.cnt = cnt;
        }
	}

}