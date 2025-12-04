import java.util.HashMap;
import java.util.HashSet;
import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<survey.length;i++){
            int value = choices[i]; /// 5

            if(value>0&& value<4){
                char suv = survey[i].charAt(0); //A
                map.put(suv,map.getOrDefault(suv,0)+4-value);
            }
            else{
                char suv2 = survey[i].charAt(1); //A
                map.put(suv2,map.getOrDefault(suv2,0)+value-4);
            }
        }
        return new StringBuilder()
                .append(map.getOrDefault('R',0)>=map.getOrDefault('T',0)?'R':'T')
                .append(map.getOrDefault('C',0)>=map.getOrDefault('F',0)?'C':'F')
                .append(map.getOrDefault('J',0)>=map.getOrDefault('M',0)?'J':'M')
                .append(map.getOrDefault('A',0)>=map.getOrDefault('N',0)?'A':'N')
                .toString();
    }
}