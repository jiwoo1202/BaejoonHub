import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class Main {

    static int n,m;
    static int[] parent;
    static int result;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 6
        m = Integer.parseInt(st.nextToken()); // 5
        parent = new int[n];
        // parent 초기화
        for(int i=0;i<n;i++){
            parent[i] = i;
        }
        // 길이만큼
        for(int i=1;i<m+1;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); //0
            int b = Integer.parseInt(st.nextToken()); //1
            //같은 부모인자가 있다는 소리
            if(!(union(a,b))){
                result=i;
                break;
            }
        }
        System.out.println(result);
    }
     //union
    static public boolean union(int a, int b) {
         int A = find(a); // a 0 1
         int B = find(b); // b 1 2
        if(A==B){
            return false;
        }
        else{
            if (A < B) {
                parent[B] = A;
            }
            else{
                parent[A] = B;
            }
            return true;
        }
     }
    ///find
   static public int find(int a) {
        if (parent[a] == a) return a;
        return parent[a] = find(parent[a]);
    }

}