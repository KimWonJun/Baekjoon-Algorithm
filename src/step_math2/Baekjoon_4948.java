package step_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_4948 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isContinue = true;
        
        while(isContinue == true){
            int startNum = Integer.parseInt(br.readLine());
            int primeCount = 0;
            if(startNum == 0)
            {
                isContinue = false;
                break;
            }
            int endNum = 2 * startNum;

            x : for(int num = startNum+1; num <= endNum; num++)
            {
                if(num == 1){
                    continue;
                }
                for(int div = 2; div <= Math.sqrt(num); div++) {
                    if(num % div == 0){
                        continue x;
                    }
                }
                primeCount++;
            }
            System.out.println(primeCount);
        }
        br.close();
    }    
}
