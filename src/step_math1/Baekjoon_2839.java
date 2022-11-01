package step_math1;

import java.util.Scanner;

public class Baekjoon_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sugar = sc.nextInt();
        int five = 0;
        int three = 0;

        while(sugar % 5 != 0 && sugar > 0)
        {
            sugar-=3;
            three++;
        }
        five = sugar / 5;
        sugar = sugar % 5;

        if(sugar < 0){
            System.out.println(-1);
        }
        else{
            System.out.println(five + three);
        }

    }
}