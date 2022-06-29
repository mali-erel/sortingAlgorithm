import java.util.ArrayList;
import java.util.Collections;

/* Title		: Homework II - Part I class.
 * Author		: Mehmet Ali EREL
 * ID			: 11260275756
 * Section		: 02
 * Assignment	: 02
 * Description	: This class contains the needed sorting algorithm and answers of asked questions. 
 * */
public class mySort {
	//Q1:
	private static void differentSort(int[] arr) {
		/* Summary		: Sorting algorithm that given us for implementation.
		 * Precondition	: dealt is a boolean and temp is an integer.
		 * Postcondition: The given array sorted an returned.
		 * */
		boolean dealt=false;
		int temp;
		do {
			for (int i = 0; i < arr.length - 2; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
					dealt = true;
					//System.out.print(arr[i]+", ");
				} 
			}
			if (dealt == false) break;
			dealt=false;
		
			for (int i = arr.length - 2; 0 < i; i--) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
					dealt = true;
					
				}
			}
			
		} while (dealt);
		printArray(arr);
	}
	/*Q2: This sorting algorithm's O notation is O(n) when the array ascending. Then the array iterates linearly.
	 *And the worst case is O(n^2) if the given array is descending.
	 * */
	// Q3: The advantage of this differentSort algorithm starts with right and find the biggest value and iterate to the last index.
		// After that, in second for loop finds smallest value and iterate to the first index.
		// However bubble sort repeatedly swaps the next element with the correct conditions.
		
	// Q4: We only need to change the if conditions to sort in descending order.
	private static void reverseDifferentSort(int[] arr) {
		/* Summary		: Sorting algorithm that asked to reversed the sorting algorithm.
		 * Precondition	: dealt is a boolean and temp is an integer.
		 * Postcondition: The given array reverse sorted an returned.
		 * */
		boolean dealt=false;
		int temp;
		do {
			for (int i = 0; i < arr.length - 2; i++) {
				if (arr[i+1] > arr[i]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					dealt = true;
				} 
			}
			if (dealt == false) break;
			dealt=false;
		
			for (int i = arr.length - 2; 0 < i; i--) {
				if (arr[i+1] > arr[i]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					dealt = true;
				} 
			}
			
		} while (dealt);
		printArray(arr);
	}
	
	static int[] ascending(int n) {
		/*
		 * Summary : By the given input returns that many randomized numbered an array.
		 * Precondition : list is an ArrayList and arr is an array. Postcondition:
		 * Random numbers are added to the arr and returned.
		 */
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] arr = new int[n];
		for (int i = 0; i<n; i++) {
			list.add(i);
		}
		for (int i = 0; i < n; i++) {
			arr[i] = list.get(i);
		}
		return arr;
	}
	static int[] myRandom(int n) {
		/*Summary		: By the given input returns that many randomized numbered an array.
		 * Precondition	: list is an ArrayList and arr is an array.
		 * Postcondition: Random numbers are added to the arr and returned.
		 * */
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		for(int i = 0; i<n;i++) {
			arr[i] = list.get(i);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		return arr;
	}
	
	static void printArray(int arr[]) {
		/*Summary		: Prints the given array.
		 * Precondition	: None
		 * Postcondition: ---
		 * */
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
		System.out.println("==========================");
	}
	static int[] descending(int n) {
		/*
		 * Summary : By the given input returns that many randomized numbered an array.
		 * Precondition : list is an ArrayList and arr is an array. Postcondition:
		 * Random numbers are added to the arr and returned.
		 */
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] arr = new int[n];
		for (int i = n; 0 < i; i--) {
			list.add(i);
		}
		for (int i = 0; i < n; i++) {
			arr[i] = list.get(i);
		}
		return arr;
	}

	public static void main(String[] args) {

		mySort.differentSort(myRandom(14));
		mySort.reverseDifferentSort(myRandom(15));
		

	}

}
