import java.io.*;
class Sample
{
    public static void main(String args[]) throws Exception
    {
        int n, k, arr[], cnt=0;
        String input, input1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();
        String in[] = input.split(" ");
        n = Integer.parseInt(in[0]);
        k = Integer.parseInt(in[1]);
        arr = new int[n];
        input1 = br.readLine();
        String inp[] = input1.split(" ");
        for(int i=0 ; i<n ; i++){
            arr[i] = Integer.parseInt(inp[i]);
            if(arr[i]%k!=0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
