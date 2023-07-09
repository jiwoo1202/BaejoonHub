import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            list.add(br.readLine());
        }


        Set<String> set = new HashSet<String>(list);
        List<String> newList = new ArrayList<String>(set);

        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()==o2.length()){
                    return o1.compareTo(o2);
                }
                else{
                    return o1.length()-o2.length();
                }

            }
        };

        Collections.sort(newList,c);

        for (String s:newList
             ) {
            System.out.println(s);
            
        }


    }
}