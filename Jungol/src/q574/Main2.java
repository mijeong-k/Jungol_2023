package q574;

import java.util.Scanner;

public class Main2 {
	
	static void maxCalcu(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = (max < arr[i]) ? arr[i] : max;
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}sc.close();
		
		maxCalcu(arr);
	}
}
