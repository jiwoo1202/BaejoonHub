import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        int result = 0;
        int num = Integer.parseInt(br.readLine());

        for(int i=0;i<num;i++){
            if(check()){
                result +=1;
            }
        }
        System.out.println(result);
    }
    static boolean check() throws IOException{
        boolean[] text = new boolean[26];
        String a = br.readLine();
        int prev = 0;
        for(int i=0;i<a.length();i++){
            int test = a.charAt(i);

            if(prev != test){
                if(text[test-'a']==false){
                    text[test-'a'] = true;
                    prev = test;
                }
                else{
                    return false;
                }
            }
           else{
            continue;
            }
        }
        return true;
    }
}