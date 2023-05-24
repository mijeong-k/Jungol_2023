package q126;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int odd = 0, even = 0;

		//1. while문
//		while (true) {
//			int inp = sc.nextInt();
//			if (inp != 0) {
//				if (inp % 2 == 1) {
//					odd++;
//				} else {
//					even++;
//				}
//			} else{
//				break;
//			}
//		}
//		sc.close();
//		System.out.println("odd : " + odd);
//		System.out.println("even : " + even);

		//2.do~while문
//		do {
//			int inp = sc.nextInt();
//			if (inp == 0) {
//				break;
//			} else if (inp % 2 == 1) {
//				odd++;
//			} else {
//				even++;
//			}
//
//		} while (true);
//		sc.close();
//		System.out.println("odd : " + odd);
//		System.out.println("even : " + even);

		// 3.배열
		int[] arr = new int[100];
		int idx = 0;

		do {
			arr[idx] = sc.nextInt();
			if (arr[idx] == 0) {
				break;
			} else if (arr[idx] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			idx++;
		} while (true);
		sc.close();
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);

	}

}
