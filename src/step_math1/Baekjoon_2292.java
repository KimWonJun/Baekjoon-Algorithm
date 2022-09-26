package step_math1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_2292 
{
    public static void main(String[] args) throws IOException
    {
        // 1 --> n = 1
        
        // 2 ~ 7 --> 2

        // 8 ~ 19 --> 3
        // 1개, 6개, 12 18

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputNum = Integer.parseInt(br.readLine());
        int num = 2;    // 최소값 기준 카운트
        int count = 1;  // 움직이는 범위, 겹

        if(inputNum == 1)
        {
            bw.write(1 + "\n");
        }
        else
        {
            while(num <= inputNum)
            {
                num = num + (count * 6);
                count++;
            }
            bw.write(count + "\n");
        }

        bw.close();
        br.close();
    }
}
