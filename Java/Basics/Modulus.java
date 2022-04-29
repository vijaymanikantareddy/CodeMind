import java.io.*;
class Sample{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a, b;
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        System.out.format("%d",a%b);
    }
}
