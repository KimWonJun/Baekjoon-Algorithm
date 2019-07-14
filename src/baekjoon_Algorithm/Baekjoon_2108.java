package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.io.IOException;

public class Baekjoon_2108 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		int[] arr = new int[count];
		int[] modeArr = new int[8001];
		int sum= 0;
		
		for(int i = 0; i < count; i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] < 0) {
				modeArr[Math.abs(arr[i]) + 4000]  += 1;
			} else {
				modeArr[arr[i]] += 1;
			}
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		double avg = 0;
		int average = 0;
		
		// 산술평균
		if(sum > 0) {
			avg = sum/count;
			average = (int) Math.round(avg);
		} else {
			avg = Math.abs(sum)/(double)count;
			average = (int) Math.round(avg) * -1;
		}
		
		// 중앙값
		int center = arr[arr.length/2];

		// 최빈값 
		int mode = 0;

		for(int i = 4000; i < modeArr.length-1; i++) {
			if(modeArr[i] != 0 && modeArr[i] > mode) {
				mode = i;
			} else if(modeArr[i] != 0 && modeArr[i] == mode) {
				mode = i;
				break;
			}
		}
		
		if(mode > 4000)
		{
			mode -= 4000;
			mode *= -1;
		}
		
		// 범위
		int range = arr[arr.length-1]- arr[0];
		
		System.out.println("----------------------------------");
		bw.write(average + "\n" + center + "\n" + mode + "\n" + range);
		br.close();
		bw.close();
	}

}
