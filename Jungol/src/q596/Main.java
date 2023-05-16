package q596;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int num = sc.nextInt();
		sc.close();

		// 1.case
		for (int i = str.length() - 1, cnt = 0; i >= cnt; i--, cnt++) {
			System.out.print(str.charAt(i));
		}

		
		// 2.case
//		if (num <= str.length()) {
//			for (int i = 1; i < num + 1; i++) {
//				System.out.print(str.charAt(str.length() - i));
//			}
//
//		} else {
//			for (int k = 1; k < str.length() + 1; k++) {
//				System.out.print(str.charAt(str.length() - k));
//			}
//		}

		
		// 3.case
//		for (int i = str.length() - 1; (0 <= i && 0 < num); i--, num--) {
//			System.out.print(str.charAt(i));
//		}
//
//		
//		if (num < str.length()) {
//			for (int i = str.length() - 1; i >= str.length()-num; i--) {
//				System.out.print(str.charAt(i));
//			}
//		} else {
//			for (int i = str.length() - 1; i >= 0; i--) {
//				System.out.print(str.charAt(i));
//			}

	}

}
