package q9019;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		arr[0] += 3;
		arr[1] -= 3;
		arr[2] *= 3;
		arr[3] /= 3;
		arr[4] %= 3;

		System.out.print("5개의 수를 입력하시오. ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
