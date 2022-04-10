import java.io.*;
class Seasons
{
    public static void main(String args[]) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int month;
        month = Integer.parseInt(br.readLine());
        switch(month){
            case 6:  case 4: case 5:
                System.out.println("Summer");
                break;
            case 10: case 7: case 8: case 9: case 11:
                System.out.println("Rainy");
                break;
            case 12: case 1:
                System.out.println("Winter");
                break;
            case 2: case 3:
                System.out.println("Spring");
                break;
            default:
                System.out.println(-1);
        }
    }
}
