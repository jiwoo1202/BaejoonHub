import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static String S;
    static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        S= br.readLine(); // 7
        int one = 0;
        int zero  = 0;

        for(int i=1;i<S.length();i++){
            if(S.charAt(i)!=S.charAt(i-1)){
                    if(S.charAt(i)=='1'){
                        one ++;
                    }
                    else{
                        zero ++;
                    }
                }
        }
        System.out.println(Math.max(one,zero));
    }
}
