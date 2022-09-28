package step_math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Baekjoon_2869 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] inputArr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int day = (inputArr[2] - inputArr[1]) / (inputArr[0] - inputArr[1]);
        if((inputArr[2] - inputArr[1])%(inputArr[0]-inputArr[1]) != 0)
        {
            day++;
        }

        System.out.println(day);
        br.close();
    }    
}
