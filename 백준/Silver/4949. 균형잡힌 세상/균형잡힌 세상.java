import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static Stack<Character> stack = new Stack<>();
    static String result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String str = br.readLine();
            if(str.equals(".")){
                break;
            }
            else{
                find(str);
            }
        }
    }

    static void find(String str){
        stack.clear();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);

            if(c=='('||c=='['){
                stack.push(c);
            }

            else if(c==')'){
                if(!stack.isEmpty()&&stack.peek()=='('){
                    stack.pop();
                }
                else {
                   stack.push(c);
                }
            }

            else if(c==']'){
                if(!stack.isEmpty()&&stack.peek()=='['){
                    stack.pop();
                }
                else {
                   stack.push(c);
                }
            }
        }
        if(stack.isEmpty()&&str.charAt(str.length()-1)=='.'){
            result = "yes";
        }
        else{
            result = "no";
        }
        System.out.println(result);
    }
}
