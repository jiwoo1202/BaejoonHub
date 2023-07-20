import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int[] A;
    static int max;
    static int leng;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());

        A = new int[n];
        for(int i=0;i<n;i++){
            A[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(A);
        leng = A.length; // 4
        max = A[A.length-1]; // 최대값
       for(int i=0;i<n;i++){
           if(A[i]*(leng-i)>max){
               max = A[i]*(leng-i);
           }
       }
        System.out.println(max);
    }
}
