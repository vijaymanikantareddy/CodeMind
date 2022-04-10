import java.io.*;
class Sample{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char a;
        a = (char) br.read();
        if(a=='V'||a=='v'){
            System.out.println("Violet");
        }
        else if(a=='I'||a=='i'){
            System.out.println("Indigo");
        }
        else if(a=='B'||a=='b'){
            System.out.println("Blue");
        }
        else if(a=='G'||a=='g'){
            System.out.println("Green");
        }
        else if(a=='Y'||a=='y'){
            System.out.println("Yellow");
        }
        else if(a=='O'||a=='o'){
            System.out.println("Orange");
        }
        else if(a=='R'||a=='r'){
            System.out.println("Red");
        }
        else{
            System.out.println(-1);
        }
    }
}
