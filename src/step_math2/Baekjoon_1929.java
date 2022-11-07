package step_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //한줄에 정수 여러개를 입력받는 경우
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int startNum = Integer.parseInt(st.nextToken());
        int endNum = Integer.parseInt(st.nextToken());

        x : for(int num = startNum; num <= endNum; num++)
        {
            if(num == 1){
                continue;
            }
            for(int div = 2; div <= Math.sqrt(num); div++) {
                if(num % div == 0){
                    continue x;
                }
            }
            System.out.println(num);
        }
        br.close();
    }
}
