package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Baekjoon_1181 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		
		// 중복 제거
		HashSet<String> set = new HashSet<String>();
		for(int i = 0; i < count; i++)
			set.add(br.readLine());
		
		ArrayList<String> list = new ArrayList<String>(set);
		
		Collections.sort(list, new Comparator<String>() {
			public int compare(String a, String b) {
				if(a.length() > b.length()) {
					return 1;
				} else if(a.length() < b.length()) {
					return -1;
				}
				
				else {
					return a.compareTo(b);
				}
			}
		});
		
		for(String result : list)
			bw.write(result + "\n");
		
		br.close();
		bw.close();
	}
}
