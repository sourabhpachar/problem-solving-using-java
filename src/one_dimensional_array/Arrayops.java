package one_dimensional_array;

import java.util.Scanner;

public class Arrayops {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// int arr[]=takeInput();

		// display(arr);
		// int a[]= {1,5,6,8,15,16}; //for searching
		// System.out.println(binary_search(a, 556));
		//int a[] = { 88, 66, 55, 44, 22, 11 };// for sorting purpose
		// bubble_sort(a);
		int a[]= {2,2,6,6,6,6,8,9,10,11,11,12,12};
		//selection_sort(a);
		System.out.println(lower_bound(a, 6));
		System.out.println(upper_bound(a,6));
	}

	public static int[] takeInput() {

		System.out.println("Size ?");
		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : ");
			arr[i] = scn.nextInt();

		}

		return arr;

	}

	public static void display(int[] arr) {

		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();

	}

	public static int binary_search(int arr[], int n) {
		int low = 0;
		int high = arr.length - 1;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (n < arr[mid]) {
				high = mid - 1;
			} else if (n > arr[mid]) {

				low = mid + 1;
			} else {
				System.out.println("found at index " + mid);
				return mid;
			}

		}

		return -1;

	}

	public static int[] bubble_sort(int arr[]) {
		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		display(arr);
		return arr;

	}

	public static int[] selection_sort(int arr[]) {
		System.out.println("in selection_sort");
		int temp = 0;

		int min;
		for (int i = 0; i < arr.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					temp = arr[min];
					arr[min] = arr[j];
					arr[j] = temp;
				}
			}
		}
		display(arr);
		return arr;
	}

	public static int lower_bound(int arr[], int n) {
		int low = 0;
		int ans = -1;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (n <= arr[mid]) {
				if (arr[mid] == n) {
					ans = mid;
				}
				high = mid - 1;
			} else {
				low = mid + 1;

			}
		}
		return ans;
	}

	public static int upper_bound(int arr[],int n) {
		int low = 0;
		int ans = -1;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (n < arr[mid]) {
				
				high = mid - 1;
			} else {
				if (arr[mid] == n) {
					ans = mid;
				}
				low = mid + 1;

			}
		}
		return ans;
	}
}
