import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> idMap = new HashMap<>(); // 정보 저장 map
        int count = 0;
        for(int i=0; i< record.length;i++){
            String[] text = record[i].split(" ");
           
            if(text[0].equals("Leave")){
                continue;
            }
            else if(text[0].equals("Enter")){
                idMap.put(text[1],text[2]);
            }
            else{
                idMap.put(text[1],text[2]);
                count++;
            }
        }
        String[] a = new String[record.length - count];
        int idx = 0;
        for(int i=0;i<record.length;i++){
            String[] text = record[i].split(" ");
            if(text[0].equals("Enter")){
                a[idx] = idMap.get(text[1])+"님이 들어왔습니다.";
                idx++;
                
            }
            else if(text[0].equals("Leave")){
                a[idx] =idMap.get(text[1])+"님이 나갔습니다.";
                idx++;
              
            }
            else{
                continue;
            }
        }
        
        String[] answer = a;
        return answer;
    }
}