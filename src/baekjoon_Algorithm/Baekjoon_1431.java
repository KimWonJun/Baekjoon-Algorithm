package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.io.IOException;

public class Baekjoon_1431 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		String[] arr = new String[count];
		for(int i = 0; i < count; i++)
		{
			arr[i] = br.readLine();
		}
		Baekjoon_1431 sn = new Baekjoon_1431();
		sn.SerialSorting(arr);
		for(int i = 0; i < count; i++)
		{
			bw.write(arr[i]+"\n");
		}
		br.close();
		bw.close();
	}
	
	public String[] SerialSorting(String[] serial_num){
		String temp;
		
		for(int i = 0; i < serial_num.length -1; i++)
		{
			int sorting_index = i;
			
			for(int k = i+1; k < serial_num.length; k++)
			{
				int count_right = 0;
				int count_left = 0;
				if(serial_num[k].length() == serial_num[sorting_index].length()) {
					for(int j = 0; j < serial_num[k].length();j++) {
						if(Character.isDigit(serial_num[k].charAt(j))) {
							count_right += serial_num[k].charAt(j) - '0';
						}
					}
					for(int j = 0; j < serial_num[sorting_index].length(); j++) {
						if(Character.isDigit(serial_num[sorting_index].charAt(j))) {
							count_left += serial_num[sorting_index].charAt(j) - '0';
						}
					}
					if(count_right == count_left) {
						for(int j = 0; j < serial_num[sorting_index].length();j++) {
							if(serial_num[k].charAt(j) != serial_num[sorting_index].charAt(j)) {
								if(serial_num[sorting_index].charAt(j)>serial_num[k].charAt(j)) {
									sorting_index = k;
									break;
								}
								break;
							}
						}
		
					} else if(count_right < count_left) {
						sorting_index=k;
					}
				}else if(serial_num[k].length() < serial_num[sorting_index].length()) {
					sorting_index = k;
				}
			}
			
			temp = serial_num[i];
			serial_num[i]  = serial_num[sorting_index];
			serial_num[sorting_index] = temp;
		}
		return serial_num;
	}
}
