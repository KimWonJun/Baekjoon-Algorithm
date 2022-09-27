package step_math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1193 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(br.readLine());

        int cross_count = 1;    // 현재 라인의 블럭 개수
        int prev_count_sum = 0; // 이전 라인까지의 블럭 누적 개수

        while(true)
        {
            if(inputNum <= prev_count_sum + cross_count)
            {
                if(cross_count % 2 == 1)    // 홀수
                {
                    System.out.println(cross_count-(inputNum-prev_count_sum-1) + "/" + (inputNum-prev_count_sum));
                    break;
                }
                else
                {
                    System.out.println((inputNum-prev_count_sum) + "/" + (cross_count-(inputNum-prev_count_sum-1)));
                    break;
                }
            }
            else
            {
                prev_count_sum += cross_count;
                cross_count++;
            }
        }
    }    
}
