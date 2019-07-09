package baekjoon_Algorithm;

import java.util.Scanner;

// Baekjoon_2751
public class Baekjoon_2751 {
	
//	// Merge sort
//	public static int[] sorted = new int[1000000];	// additional array
//	
//	public static void merge(int a[], int left, int middle, int right) {
//		int i = left;
//		int j = middle + 1;
//		int k = left;
//		// add into array 
//		while( i <= middle && j <= right)
//		{
//			if (a[i] <= a[j]) {
//				sorted[k] = a[i];
//				i++;
//			} else {
//				sorted[k] = a[j];
//				j++;
//			}
//			k++;
//		}
//		// if one of two has finished first insert the remain data
//		if(i > middle) {	// if i ended first
//			for(int t = j; t <= right; t++)
//			{
//				sorted[k] = a[t];
//				k++;
//			}
//		} else {			// if j ended first
//			for(int t = i; t <= middle; t++)
//			{
//				sorted[k] = a[t];
//				k++;
//			}
//		}
//		
//		for(int z = left; z <= right; z++) {
//			a[z] = sorted[z];
//		}
//	}
//	
//	public static void mergeSort(int a[], int m, int n) {
//		// when the size is bigger than 1
//		if(m < n) {
//			int middle = (m + n) /2;
//			mergeSort(a, m, middle);
//			mergeSort(a, middle+1, n);
//			merge(a, m, middle, n);
//		}
//	}
//	
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int count = scan.nextInt();
//		int i = 0;
//		int[] arr = new int[count];
//		
//		while(i < count)
//		{
//			arr[i++] = scan.nextInt();
//		}
//		
//		mergeSort(arr, 0, count-1);
//		for(int j = 0; j < count; j++)
//			System.out.println(arr[j]);
//		
//		scan.close();
//	}
	
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int number = scan.nextInt();
		int[] heap = new int[number+1];
		int z = 0;
		while(z < number)
			heap[z++] = scan.nextInt();
		
		// Maximum heap structure
		for(int i = 1; i < number; i++)
		{
			int c = i;
			do {
				int root = (c - 1) / 2;
				if(heap[root] < heap[c]) {
					int temp = heap[root];
					heap[root] = heap[c];
					heap[c]= temp;
				}
				c = root;
			}while(c != 0);
		}
		
		// Make size down and compose heap
		for(int i = number - 1; i >= 0; i--) {
			// Send the biggest to the last
			int temp = heap[0];
			heap[0] = heap[i];
			heap[i] = temp;
			int root = 0;
			int c = 1;
			// Part of making heap structure
			do {
				c = 2 * root + 1;
				// Find bigger one between two children
				if(c < i-1 && heap[c] < heap[c+1] ) {
					c++;
				}
				// If child is bigger than root
				if(c<i && heap[root] < heap[c]) {
					int temp2 = heap[root];
					heap[root] = heap[c];
					heap[c]= temp2;
				}
				root = c;
			}while(c < i);
		}
		
		for(int i = 0; i < number; i++)
			System.out.println(heap[i]);
		
		
		scan.close();
	}
}
