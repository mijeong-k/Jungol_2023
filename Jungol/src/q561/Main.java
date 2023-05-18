package q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//1.case
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int max = 0;
		int min = 10000;
		
		for (int k = 0; k < arr.length; k++) {
			arr[k] = sc.nextInt();
			
			if (1 <= arr[k] && arr[k] < 100) {
				max = max < arr[k] ? arr[k] : max;
			}
			if (100 <= arr[k] && arr[k] < 10000) {
				min = min < arr[k] ? min : arr[k];
			}
		}
		System.out.print((max != 0) ? (max + " ") : (100 + " "));
		System.out.print((min != 10000) ? (min + " ") : (100 + " "));		
		sc.close();
		
		
		//2.case
//		Scanner sc = new Scanner(System.in);
//		int[] num = new int[10];
//		for (int i = 0; i < num.length; i++) {
//			num[i] = sc.nextInt();
//		}
//		sc.close();


// 100 미만의 수만 출력
//		int max = 0;
//		for (int i = 0; i < num.length; i++) {
//			if (num[i] < 100) {
//				if (num[i] > max) {
//					max = num[i];
//				}
//			}
//		}
//		if (max == 0) {
//			max = 100;
//		}
//		System.out.print(max + " ");

// 100 이상의 수만 출력
//		int min = 10000;
//		for (int i = 0; i < num.length; i++) {
//			if (num[i] >= 100) {
//				if (num[i] < min) {
//					min = num[i];
//				}
//			}
//		}
//		if (min == 10000) {
//			min = 100;
//		}
//		System.out.println(min);

		
	}
}
