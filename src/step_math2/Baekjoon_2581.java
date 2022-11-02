package step_math2;

import java.util.Scanner;

public class Baekjoon_2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        int sum = 0;
        int min = secondNum;

        x: for(int a = firstNum; a <= secondNum; a++)
        {    
            if(a == 1) continue;        
            for(int divide = 2; divide < a; divide++)
            {
                if(a % divide == 0)
                {
                    continue x;
                }
            }
            sum += a;
            if(min > a){
                min = a;
            }
        }
        if(sum == 0){
            System.out.println(-1);
        }
        else
        {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
