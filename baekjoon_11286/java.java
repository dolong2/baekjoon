import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PriorityQueue<Integer> que=new PriorityQueue<>((o1, o2) ->
                Math.abs(o1) == Math.abs(o2) ? Integer.compare(o1, o2) : Integer.compare(Math.abs(o1), Math.abs(o2)));
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            if(k==0){
                if(que.size()==0){
                    System.out.println(0);
                }
                else{
                    System.out.println(que.poll());
                }
                continue;
            }
            que.add(k);
        }
    }
}