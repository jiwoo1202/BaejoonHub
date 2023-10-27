import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static String[][] people;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        people = new String[N][2];

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            people[i][0] = st.nextToken();
            people[i][1] = st.nextToken();
        }

        /// 오름차순
       Arrays.sort(people, new Comparator<String[]>() {
//           @Override
//           public int compare(String[] o1, String[] o2) {
//               return 0;
//           }
           @Override
           public int compare(String[] o1, String[] o2){
               return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
           }
       });

        for(int i = 0; i < N; i++) {
            System.out.println(people[i][0] + " " + people[i][1]);
        }
    }
}
