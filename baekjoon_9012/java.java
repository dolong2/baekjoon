import java.util.Scanner;
import java.util.Stack;
class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);
    String k="";
    Stack<Integer> stack=new Stack<>();
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      String s=sc.next();
      int ch=0;
      for(int j=0;j<s.length();j++){
        char c= s.charAt(j);
        if(c=='('){
          stack.push(1);
        }
        else{
          if(stack.empty()){
            ch++;
          }
          else{
            stack.pop();
          }
        }
      }
      boolean check=stack.empty();
      if(check&&ch==0){
        k+="YES"+'\n';
      }
      else{
        k+="NO"+'\n';
      }
      stack.clear();
    }
    System.out.println(k);
    sc.close();
  }
}