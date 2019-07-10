package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_10989 {

//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//		int count = Integer.parseInt(br.readLine());
//		int[] arr = new int[count];
//		for(int i =0; i < arr.length;i++)
//		{
//			arr[i] = Integer.parseInt(br.readLine());
//		}
//		br.close();
//		
//		// 힙 구성
//		for(int i = 1; i< count; i++)
//		{
//			int c = i;
//			do {
//				int root = (c - 1)/2;
//				if(arr[root] < arr[c])
//				{
//					int temp = arr[root];
//					arr[root] = arr[c];
//					arr[c] = temp;
//				}
//				c = root;
//			} while(c != 0);
//		}
//		// 정렬
//		for(int i = count-1; i>= 0; i--)
//		{
//			int temp = arr[0];
//			arr[0] = arr[i];
//			arr[i] = temp;
//			int root = 0;
//			int c = 1;
//			do {
//				c = 2*root + 1;
//				// 자식 중 큰 값 찾기
//				if(c < i - 1 && arr[c] < arr[c+1]) {
//					c++;
//				}
//				if(c < i && arr[root] < arr[c]) {
//					temp = arr[root];
//					arr[root] = arr[c];
//					arr[c] = temp;
//				}
//				root = c;
//			}while(c < i);
//		}
//			
//		for(int i = 0; i < count; i++)
//		{
//			bw.write(arr[i] + "\n");
//		}
//		
//		bw.flush();
//		bw.close();
//	}
	
	// 계수 정렬
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		int[] arr = new int[10000];
		
		for(int i = 0; i < count; i++)
		{
			arr[Integer.parseInt(br.readLine())-1] += 1;
		}
		
		for(int i = 0; i < 10000; i++)
		{
			if(arr[i] != 0) {
				for(int j = 0; j < arr[i]; j++)
				{
					bw.write(i+1 +"\n");
				}
			}
		}
		br.close();
		bw.close();
	}
}















