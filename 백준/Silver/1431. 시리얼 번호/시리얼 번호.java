import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    static int N;
    static List<String> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            list.add(br.readLine());
        }
       Collections.sort(list, new Comparator<String>() {
           @Override
           public int compare(String o1, String o2) {
               /// 길이가 같을 떄
               if(o1.length() == o2.length()){
                   int sum = 0;
                   int sum2 = 0;
                   for(int i=0;i<o1.length();i++){
                       if(Character.isDigit(o1.charAt(i))){
                           sum += o1.charAt(i)-'0';
                       }
                       if(Character.isDigit(o2.charAt(i))){
                           sum2 += o2.charAt(i)-'0';
                       }
                   }
                   if(sum == sum2){
                       return o1.compareTo(o2);
                   }
                   else{
                       return sum - sum2;
                   }
               }
               else{
                   return o1.length() - o2.length();
               }
           }
       });

        for(String s : list){
            System.out.println(s);
        }
    }
}
