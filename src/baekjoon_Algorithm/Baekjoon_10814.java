package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Baekjoon_10814 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		
		String[][] arr = new String[count][3];
		
		for(int i = 0; i < count; i++)
		{
			String input = br.readLine();
			
			arr[i][0] = String.valueOf(i);
			arr[i][1] = input.split(" ")[0];
			arr[i][2] = input.split(" ")[1];
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				if(o1 == o2) {
					return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
				} else {
					return Integer.compare(Integer.parseInt(o1[1]), Integer.parseInt(o2[1]));
				}
			}
		});

		for (int i = 0; i < count; i++) 
		{
			bw.write(arr[i][1] + " " + arr[i][2] + "\n");
		}
		
		br.close();
		bw.close();
	}
}















