import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Stack<Double> stack=new Stack<>();
        int[] num=new int[Integer.parseInt(br.readLine())];
        String str=br.readLine();
        for(int i=0;i<num.length;i++){
            num[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<str.length();i++){
            char now=str.charAt(i);
            if(now!='*'&&now!='+'&&now!='-'&&now!='/'){
                int a=now-'A';
                stack.push((double)num[a]);
            }
            else{
                double op2=stack.pop();
                double op1= stack.pop();
                switch (now){
                    case '*':
                        stack.push((double)op1*op2);
                        break;
                    case '+':
                        stack.push((double)op1+op2);
                        break;
                    case '-':
                        stack.push((double)op1-op2);
                        break;
                    case '/':
                        stack.push((double)op1/op2);
                        break;
                }
            }
        }
        System.out.printf("%.2f",stack.pop());
    }
}