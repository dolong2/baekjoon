import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int cnt=1;
        Stack<Integer>stack=new Stack<>();
        ArrayList list=new ArrayList();
        for(int i=0;i<n;i++){
            int a=Integer.parseInt(br.readLine());
            boolean check=false;
            while(cnt<=a){
                list.add("+");
                stack.push(cnt++);
                check=true;
            }
            while(!stack.empty()&&stack.peek()>=a){
                stack.pop();
                list.add("-");
                check=true;
            }
            if(!check){
                System.out.println("NO");
                return;
            }
        }
        for(var i:list){
            System.out.println(i);
        }
    }
}
