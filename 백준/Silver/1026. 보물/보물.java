import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static List<Integer> A = new ArrayList<>();
    static List<Integer> B = new ArrayList<>();
    static int num;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            A.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            B.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(A);
        Collections.sort(B,Collections.reverseOrder());

        for(int i=0;i<n;i++){
           num += A.get(i)*B.get(i);
        }

        System.out.println(num);
    }
}
