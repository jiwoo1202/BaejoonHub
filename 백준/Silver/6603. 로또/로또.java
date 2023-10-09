import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int k;
    static int [] s;
    static boolean [] chk;
    public static void main(String[] args) throws  Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String testCase=br.readLine();
            if(testCase.equals("0")) break;
            String [] input=testCase.split(" ");
            k=Integer.parseInt(input[0]);
            s=new int[k];
            chk=new boolean[k];
            for(int i=0;i<k;i++){
                s[i]=Integer.parseInt(input[i+1]);
            } //초기 값 세팅

            dfs(0,0);
            System.out.println();
        }
    }

    public static void dfs(int depth,int start){
        if(depth==6){
            for(int i=0;i<k;i++){
                if(chk[i]){
                    System.out.print(s[i]+" ");
                }
            }
            System.out.println();
        }
        for(int i=start;i<k;i++){
            chk[i]=true;
            dfs(depth+1,i+1);
            chk[i]=false;
        }
    }
}