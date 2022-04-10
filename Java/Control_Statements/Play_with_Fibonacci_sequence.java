import java.io.*;
class Sample
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, a=0, b=1, c;
        n = Integer.parseInt(br.readLine());
        System.out.printf(a+" ");
        System.out.printf(b+" ");
        for(int i=2 ; i<n ; i++){
            c = a+b;
            a = b;
            b = c;
            System.out.printf(c+" ");
        }
    }
}
