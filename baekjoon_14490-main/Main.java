import java.io.*;
import java.util.Scanner;
class Main {
  public static int gcd(int a,int b){
    int temp;
    if(a<b){
      temp=b;
      b=a;
      a=temp;
    }
    while(b!=0){
      temp=a%b;
      a=b;
      b=temp;
    }
    return a;
  }
  public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);
    int a=0,b=0;
    String c="M";
    c= sc.next();
    a=Integer.parseInt(c.substring(0,c.indexOf(":")));
    b=Integer.parseInt(c.substring(c.indexOf(":")+1,c.length()));
    int d = gcd(a,b);
    System.out.println(a/d+":"+b/d);
    sc.close();
  }
}
