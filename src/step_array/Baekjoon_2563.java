package step_array;

import java.util.Scanner;

public class Baekjoon_2563 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] inputArr = new int[100][100];
        int count = sc.nextInt();
        int cnt = 0;

        for(int index = 0; index < count; index++){
            int width = sc.nextInt();
            int height = sc.nextInt();

            for(int j = width; j < width + 10; j++){
                for(int k = height; k < height + 10; k++){
                    if(inputArr[j][k] == 1){
                        continue;
                    }
                    inputArr[j][k] = 1;
                    cnt++;
                }
            }
        }
        sc.close();

        System.out.println(cnt);
    }
}
