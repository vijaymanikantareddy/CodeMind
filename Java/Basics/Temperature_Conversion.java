import java.io.*;
class Sample{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double c;
        double fahrenheit;
        String input;
        input=br.readLine();
        String in[]=input.split(" ");
        c=Double.parseDouble(in[0]);
        fahrenheit=(double)((c*9)/5)+32;
        System.out.format("%.2f",fahrenheit);

    }
}
