package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.io.IOException;

public class Baekjoon_1431 {
	
	int sum(String[] a) {
		int n = a.length;
		int sum  = 0;
		for(int i = 0; i < n; i++)
		{
			if(a[i].charAt(i) - '0' <= 9 && a[i].charAt(i) - '0' >= 0) {
				sum += a[i].charAt(i) - '0';
			}
		}
		return sum;
	}
	
	boolean compare(String a, String b) {
		if(a.length() < b.length())
			return a.length() < b.length();
		else 
		{
			int aSum = sum(a);
		}
		
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		String[] arr = new String[count];
		for(int i = 0; i < count; i++)
		{
			arr[i] = br.readLine();
		}
		
	}

}
