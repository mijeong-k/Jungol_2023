package q574;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		MaxCalcu max = new MaxCalcu();

		max.setMaxarr(arr);
		max.print();
	}

}
