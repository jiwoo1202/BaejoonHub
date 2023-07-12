import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int n,m;
    static HashSet<String> list = new HashSet<>();
    static int result;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for(int i=0;i<n;i++){
            list.add(br.readLine());
        }
        for(int i=0;i<m;i++){
            String str= br.readLine();

            if(list.contains(str)){
                result++;
            }
        }

        System.out.println(result);
    }

}
