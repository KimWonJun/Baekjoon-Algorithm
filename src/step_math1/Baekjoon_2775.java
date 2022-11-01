package step_math1;

import java.util.Scanner;

public class Baekjoon_2775 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        int k, n;
        for(int i = 0; i < T; i++)
        {
            k = in.nextInt();
            n = in.nextInt();

            int[] floor = new int[n];

            for(int j = 0; j <= k; j++)
            {
                for(int l=0; l < n; l++)
                {
                    if(j==0)
                    {
                        if(l == 0){
                            floor[l] = 1;
                        }
                        else{
                            floor[l] = l + 1;
                        }
                    }
                    else{
                        if(l > 0)
                        {
                            floor[l] = floor[l] + floor[l-1];
                        }
                    }
                }
            }
            System.out.println(floor[n-1]);
        }
    }
}
