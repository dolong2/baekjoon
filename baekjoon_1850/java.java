import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//입력은 2번만 받아서 BufferReader안씀 그런데 출력은 여러번 하니까 시간초과나서 시간초과 방지용
        long a,b;
        a=sc.nextLong();
        b=sc.nextLong();
        for(int i=0;i<gcd(a,b);i++){
            bw.write("1");
        }
        bw.write('\n');
        bw.flush();
        bw.close();
    }
    public static long gcd(long a,long b){
        return b!=0?gcd(b,a%b):a;
    }
}