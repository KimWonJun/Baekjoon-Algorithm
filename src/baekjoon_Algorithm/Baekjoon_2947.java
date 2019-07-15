package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_2947 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = Integer.parseInt(input.split(" ")[i]);
		}
		
		for(int i = 0; i < 5; i++)
		{
			for(int  j = 1; j < 5 - i; j++){
				if(arr[j] < arr[j - 1]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					
					for(int k = 0; k < 5; k++)
					{
						bw.write(arr[k] + " ");
					}
					bw.write("\n");
				}
				
			}
			
		}
		br.close();
		bw.close();
	}

}
