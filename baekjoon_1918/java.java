import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static int pri(char c){//priority
        if(c==')'||c=='('){
            return -1;
        }
        if(c=='+'||c=='-'){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='+'||c=='-'||c=='*'||c=='/'){
                while(!stack.empty()&&pri(c)<=pri(stack.peek())){
                    System.out.print(stack.pop());
                }
                stack.push(c);
            }
            else if(c=='('){
                stack.push(c);
            }
            else if(c==')'){
                char top_op=stack.pop();
                while(top_op!='('){
                    System.out.print(top_op);
                    top_op=stack.pop();
                }
            }
            else{
                System.out.print(c);
            }
        }
        while(!stack.empty()){
            System.out.print(stack.pop());
        }
    }
}