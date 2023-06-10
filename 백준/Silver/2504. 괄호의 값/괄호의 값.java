import org.w3c.dom.CDATASection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack = new Stack<>();
        String ci = br.readLine();

        int mul = 1;
        int result = 0;
        String test = "false";
        for(int i=0; i<ci.length();i++){
            char c = ci.charAt(i);
            switch (c) {
                case '(' :
                    stack.push("(");
                    mul *= 2;
                    break;
                case '[':
                    stack.push("[");
                    mul *= 3;
                    break;

                case  ')':
                    if(stack.isEmpty()||stack.peek()!="("){
                        result = 0;
                        test = "true";
                        break;
                    }
                    if(ci.charAt(i-1)=='('){
                        result += mul;
                    }
                        stack.pop();
                        mul /= 2;
                        break;
                case  ']':
                    if(stack.isEmpty()||stack.peek()!="["){
                        result = 0;
                        test = "true";
                        break;
                    }
                    if(ci.charAt(i-1)=='['){
                        result += mul;
                    }
                    stack.pop();
                    mul /= 3;
                    break;
            }

            if(test == "true"){
                break;
            }
        }
        System.out.println(stack.isEmpty()?result:0);
    }
}