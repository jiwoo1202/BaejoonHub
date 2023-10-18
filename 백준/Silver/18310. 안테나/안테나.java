import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    static int N;
    static int[] house;
    static int total;
    static int[] sumList;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        house = new int[N];
        sumList = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            house[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(house);

        if(N % 2 ==0){
            total = N / 2;
            System.out.println(house[total-1]);
        }
        else{
            total = N / 2;
            System.out.println(house[total]);
        }


    }
}
