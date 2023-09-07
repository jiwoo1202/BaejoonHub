import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;


public class Main {
    static int num;
    static long[] d;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        d = new long[num+1];
        d[0] = 0;
        d[1] = 1;
        for(int i=2;i<=num;i++){
            d[i] = d[i-1]+d[i-2];
        }
        System.out.println(d[num]);
    }
}