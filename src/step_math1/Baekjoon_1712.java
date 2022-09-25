package step_math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.Stream;

public class Baekjoon_1712 {
    public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long result = 0;

        long[] inputArr = Stream.of(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

        // "A  + B * 개수 <= C * 개수" 가 되는 시점의 개수
        if(inputArr[1] > inputArr[2])
        {
            result = -1;
        }
        else
        {
            result = (inputArr[0]/(inputArr[2]-inputArr[1]))+1;
        }

        bw.write(result + "\n");
        
        bw.close();
        br.close();
    }
}