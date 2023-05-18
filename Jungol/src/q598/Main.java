package q598;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		do {
//			char cha = sc.next().charAt(0);
//			if (64 < cha && cha < 91 || 96 < cha && cha < 123) {
//				System.out.println(cha);
//			} else if (47 < cha && cha < 58) {
//				System.out.println((int)cha);
//			} else {
//				break;
//			}
//		} while (true);
//		sc.close();

		//1.case
//		do {
//			char cha = sc.next().charAt(0);
//			if ('A' <= cha && cha <= 'Z' || 'a' <= cha && cha <= 'z') {
//				System.out.println(cha);
//			} else if ('0' <= cha && cha <= '9') {
//				System.out.printf("%d\n", (int)cha);
//			} else {
//				break;
//			}
//		} while (true);
//		sc.close();
		
		
		// 2.case
		while (true) {
			char c = sc.next().charAt(0);
			if (Character.isAlphabetic(c)) {
				System.out.println(c);
			} else if (Character.isDigit(c)) {
				System.out.println((int) c);
			} else {
				break;
			}

		}
		sc.close();

	}

}
