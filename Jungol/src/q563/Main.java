package q563;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int arr2[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		int num = arr[0];
		for (int i = 1; i < arr.length; i++) {
			num = num < arr[i] ? num : arr[i];
		}
		arr2[0] = num;

		int num1 = arr2[0];
		for (int i = 0; i < arr.length; i++) {
			num1 = num1 < arr[i] ? arr[i] : num1;
		}
		arr2[9] = num1;

		int num2 = arr2[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr2[9]) {
				num2 = num2 < arr[i] ? arr[i] : num2;
			} else {
				i = i + 1;
			}
		}
		arr2[8] = num2;

		int num3 = arr2[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr2[8]) {
				num3 = num3 < arr[i] ? arr[i] : num3;
			} else {
				i = i + 1;
			}
		}
		arr2[7] = num3;

		int num4 = arr2[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr2[7]) {
				num4 = num4 < arr[i] ? arr[i] : num4;
			} else {
				i = i + 1;
			}
		}
		arr2[6] = num4;

		int num5 = arr2[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr2[6]) {
				num5 = num5 < arr[i] ? arr[i] : num5;
			} else {
				i = i + 1;
			}
		}
		arr2[5] = num5;

		int num6 = arr2[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr2[5]) {
				num6 = num6 < arr[i] ? arr[i] : num6;
			} else {
				i = i + 1;
			}
		}
		arr2[4] = num6;
		
		int num7 = arr2[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr2[4]) {
				num7 = num7 < arr[i] ? arr[i] : num7;
			} else {
				i = i + 1;
			}
		}
		arr2[3] = num7;
		
		int num8 = arr2[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr2[3]) {
				num8 = num8 < arr[i] ? arr[i] : num8;
			} else {
				i = i + 1;
			}
		}
		arr2[2] = num8;
		
		int num9 = arr2[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr2[2]) {
				num9 = num9 < arr[i] ? arr[i] : num9;
			} else {
				i = i + 1;
			}
		}
		arr2[1] = num9;
		
		System.out.println(arr2[9]+" "+arr2[8]+" "+arr2[7]+" "+arr2[6]+" "+arr2[5]+" "+arr2[4]+" "+arr2[3]+" "+arr2[2]+" "+arr2[1]+" "+arr2[0]);
	}

}

