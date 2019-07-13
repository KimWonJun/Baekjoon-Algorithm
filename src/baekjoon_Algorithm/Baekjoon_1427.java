package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Baekjoon_1427 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		ArrayList<String> arr= new ArrayList<String>();
		for(int i = 0; i < input.length(); i++) {
			arr.add(String.valueOf(input.charAt(i)));
		}
		
		Collections.sort(arr);
		for(int i = arr.size()-1; i>= 0; i--) {
			bw.write(arr.get(i));
		}
		br.close();
		bw.close();
	}

}
