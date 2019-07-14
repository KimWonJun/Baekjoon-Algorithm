package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Baekjoon_11650 {

//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int count = Integer.parseInt(br.readLine());
//
//		String[] arr = new String[count];
//		ArrayList<Integer> arrX =  new ArrayList<Integer>();
//		ArrayList<Integer> arrY =  new ArrayList<Integer>();
//		
//		for(int i = 0 ; i < count; i++)
//		{
//			arr[i] = br.readLine();
//			arrX.add(Integer.parseInt(arr[i].split(" ")[0]));
//			arrY.add(Integer.parseInt(arr[i].split(" ")[1]));
//		}
//
//		Collections.sort(arrY);
//		Collections.sort(arrX);
//		for(int i = 0; i < count; i++) {
//			arr[i] = arrX.get(i) + " " + arrY.get(i);
//			System.out.println(arr[i]);
//		}
//		br.close();
//	}

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		int[][] arr = new int[count][2];
		String input = "";
		
		for (int i = 0; i < count; i++) {
			input = br.readLine();
			arr[i][0] = Integer.parseInt(input.split(" ")[0]);
			arr[i][1] = Integer.parseInt(input.split(" ")[1]);
		}
		
		// 백준 11650 문제 
//		Arrays.sort(arr, new Comparator<int[]>() {
//			@Override
//			public int compare(int[] o1, int[] o2) {
//				if(o1[0] == o2[0])
//					return Integer.compare(o1[1], o2[1]);
//				else
//					return Integer.compare(o1[0], o2[0]);
//			}
//		});
		
		// 백준 11651 문제 
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1])
					return Integer.compare(o1[0], o2[0]);
				else
					return Integer.compare(o1[1], o2[1]);
			}
		});
		
		for(int i = 0; i < count; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}













