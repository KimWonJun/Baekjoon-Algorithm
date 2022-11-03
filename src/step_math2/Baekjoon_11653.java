package step_math2;

import java.util.Scanner;

public class Baekjoon_11653 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);    
        int inputNum = sc.nextInt();

        while(inputNum > 1)
        {
            int divNum = 2;            
            while(inputNum % divNum != 0)
            {
                divNum++;
                continue;
            }
            System.out.println(divNum);
            inputNum /= divNum;
        }        
    }
}
