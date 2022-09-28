package step_math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Baekjoon_10250 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int X = Integer.parseInt(st.nextToken());
            st.nextToken();
            int Y = Integer.parseInt(st.nextToken());

            if(Y % X == 0)
            {
                sb.append((X * 100) + Y/X);
                sb.append("\n");
            }
            else
            {
                sb.append((Y % X) * 100 + ((Y/X) + 1));
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }    
}
