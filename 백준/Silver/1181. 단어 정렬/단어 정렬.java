import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static ArrayList<String> list = new ArrayList<>();
    static HashSet<String> hashSet = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length()){
                    return o1.compareTo(o2);
                }
                else{
                    return o1.length()-o2.length();
                }
            }
        };

        for(int i=0;i<num;i++){
            list.add(br.readLine());
        }
        Set<String> set= new HashSet<>(list);
        List<String> newlist = new ArrayList<>(set);

       Collections.sort(newlist,c);

        for(String s : newlist){
            System.out.println(s);
        }
    }
}
