package step_math2;

import java.util.Scanner;

public class Baekjoon_9020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for(int i = 0; i < count; i++)
        {
            int[] answer = new int[2];
            int inputNum = sc.nextInt();
            for(int j = 2; j <= inputNum / 2; j++){
                if(isPrime(j)){
                    if(isPrime(inputNum-j)){
                        answer[0] = j;
                        answer[1] = inputNum-j;
                    }
                }                
            }
            System.out.println(answer[0] + " " + answer[1]);
        }
        sc.close();
    }

    private static boolean isPrime(int num){
        for(int k = 2; k <= Math.sqrt(num); k++){
            if(num % k == 0){
                return false;
            }            
        }
        return true;
    }
}
