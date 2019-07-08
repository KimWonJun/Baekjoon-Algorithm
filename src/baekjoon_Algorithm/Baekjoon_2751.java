package baekjoon_Algorithm;

import java.util.Scanner;

// Baekjoon_2751
public class Baekjoon_2751 {
	
	public static int[] sorted = new int[1000000];	// additional array

	public static void merge(int a[], int left, int middle, int right) {
		int i = left;
		int j = middle + 1;
		int k = left;
		// add into array 
		while( i <= middle && j <= right)
		{
			if (a[i] <= a[j]) {
				sorted[k] = a[i];
				i++;
			} else {
				sorted[k] = a[j];
				j++;
			}
			k++;
		}
		// if one of two has finished first insert the remain data
		if(i > middle) {	// if i ended first
			for(int t = j; t <= right; t++)
			{
				sorted[k] = a[t];
				k++;
			}
		} else {			// if j ended first
			for(int t = i; t <= middle; t++)
			{
				sorted[k] = a[t];
				k++;
			}
		}
		
		for(int z = left; z <= right; z++) {
			a[z] = sorted[z];
		}
	}
	
	public static void mergeSort(int a[], int m, int n) {
		// when the size is bigger than 1
		if(m < n) {
			int middle = (m + n) /2;
			mergeSort(a, m, middle);
			mergeSort(a, middle+1, n);
			merge(a, m, middle, n);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int i = 0;
		int[] arr = new int[count];
		
		while(i < count)
		{
			arr[i++] = scan.nextInt();
		}
		
		mergeSort(arr, 0, count-1);
		for(int j = 0; j < count; j++)
			System.out.println(arr[j]);
		
		scan.close();
	}
}
