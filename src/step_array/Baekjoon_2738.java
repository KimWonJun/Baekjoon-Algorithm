package step_array;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int column = sc.nextInt();
        List<int[][]> matrixList = new ArrayList<>();
        int i, j, k = 0;
        for(i = 0; i < 2; i++){            
            int[][] matrix = new int[row][column];
            for(j = 0; j < row; j++){
                for(k = 0; k < column; k++){
                    matrix[j][k] = sc.nextInt();
                }
            }
            matrixList.add(matrix);
        }

        for(int r = 0; r < row; r++){
            for(int c = 0; c < column; c++){
                System.out.print(matrixList.get(0)[r][c] + matrixList.get(1)[r][c]);
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}
