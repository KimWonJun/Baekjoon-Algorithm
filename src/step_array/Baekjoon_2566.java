package step_array;

import java.util.Scanner;

public class Baekjoon_2566 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[9][9];

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                matrix[i][j] = sc.nextInt(); 
            }
        }
        sc.close();

        int maxNum = matrix[0][0];
        int maxRow = 1;
        int maxColumn = 1;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(matrix[i][j] > maxNum){
                    maxNum = matrix[i][j];
                    maxRow = i+1;
                    maxColumn = j+1;
                }
            }
        }

        System.out.println(maxNum);
        System.out.print(maxRow + " " + maxColumn);
    }
}
