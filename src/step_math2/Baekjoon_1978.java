package step_math2;

import java.util.Scanner;

public class Baekjoon_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputCount = sc.nextInt();
        int count = 0;

        for(int a = 0; a < inputCount; a++){
            int inputNum = sc.nextInt();
            boolean isPrime = true;

            if(inputNum == 1){ 
                continue;
            }

            for(int divide = 2; divide < inputNum; divide++)
            {
                if(inputNum % divide == 0)
                {
                    isPrime = false;
                }
            }
            if(isPrime)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
