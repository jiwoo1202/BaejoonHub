import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;


public class Main {
    static int n,k;
    static int[] visited = new int[100001];
    static Queue<Integer> que = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); //5
        k = Integer.parseInt(st.nextToken()); // 17

        if(n==k){
            System.out.println(0);
        }
        else{
            bfs(n);
        }

    }
    static void bfs(int node){
        que.add(node);
        visited[node] = 1;

        while(!que.isEmpty()){
            int num = que.poll();

            for(int i=0;i<3;i++){
               int next=0;
               if(i==0){
                   next = num+1; // 5 11 21
               }
               else if(i==1){
                   next = num-1; // 4 9 19
               }
               else {
                   next = num*2; // 10 20 40
               }
               if(next == k){
                   System.out.println(visited[num]);
                   return;
               }
               if(next>=0 && next < visited.length && visited[next]==0){
                   que.add(next);
                   visited[next] = visited[num]+1;
               }
            }
        }
    }
}