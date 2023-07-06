import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] result = new int[T];
        for(int i=0; i<T; i++) {
            String[] input = br.readLine().split(" ");
            String[] print = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);

            LinkedList<int[]> q = new LinkedList<>();

            for(int j=0; j<N; j++) {
                q.offer(new int[]{j, Integer.parseInt(print[j])});
            }

            int cnt = 0;

            while(!q.isEmpty()) {
                int[] nowPrint = q.poll();
                boolean isMax = true;

                for(int j=0; j<q.size(); j++) {
                    if(nowPrint[1] < q.get(j)[1]) {
                        q.offer(nowPrint);
                        for(int h=0; h<j; h++) {
                            q.offer(q.poll());
                        }
                        isMax = false;
                        break;
                    }
                }

                if(isMax == false) continue;

                cnt++;
                if(nowPrint[0] == M) {
                    break;
                }
            }
            result[i] = cnt;
        }
        for (int i : result) {
            System.out.println(i);
        }
    }
}