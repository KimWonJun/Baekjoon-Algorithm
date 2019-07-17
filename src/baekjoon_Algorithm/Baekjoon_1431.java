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
		
//		Arrays.sort(arr, new Comparator<String[]>() {
//
//			@Override
//			public int compare(String[] a, String[] b) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//		});
	}
	
	boolean compare(String a, String b)
	{
		if(a.length() != b.length())
		{
			return a.length() < b.length();
		} else {
			int aSum= 0;
			int bSum = 0;
			for(int i = 0; i < a.length(); i++)
			{
				if(Character.isDigit(a.charAt(i)))
					aSum += a.charAt(i);
			}
			for(int i = 0; i < b.length(); i++)
			{
				if(Character.isDigit(b.charAt(i)))
					bSum += b.charAt(i);
			}
			if( aSum != bSum) {
				return aSum<bSum;
			} else {
				return (a.compareTo(b) == 1)? true:false;
			}
		}
		
	}
}
