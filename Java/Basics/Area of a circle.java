import java.io.*;
class Sample{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double r, area;
        r = Double.parseDouble(br.readLine());
        area = 3.14*r*r;
        System.out.format("%.2f",area);
    }
}
