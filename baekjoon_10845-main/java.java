import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int back = 0;
        Queue<Integer> que=new LinkedList<>();
        for(int i=0;i<n;i++){
            String string=sc.next();
            if(string.equals("push")){
                int q=sc.nextInt();
                back=q;
                que.add(q);
            }
            else if(string.equals("pop")){
                if(que.size()==0){
                    System.out.println(-1);
                }
                else
                    System.out.println(que.poll());
            }
            else if(string.equals("size")){
                System.out.println(que.size());
            }
            else if(string.equals("empty")){
                if (que.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
            else if(string.equals("front")){
                if (que.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(que.peek());
                }
            }
            else if(string.equals("back")){
                if (que.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(back);
                }
            }
        }
    }
}