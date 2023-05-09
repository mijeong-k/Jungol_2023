package q557;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//1. for문 				
//		char[] cinp = new char[10];
//		for (int i = 0; i < cinp.length; i++) {
//			cinp[i] = sc.next().charAt(0);
//		}
//		System.out.print(cinp[0] + " " + cinp[3] + " " + cinp[6]);
//		sc.close();

		
//2. for,switch문 	
		char num[] = new char[10];
		for (int m = 0; m < num.length; m++) {
			num[m] = sc.next().charAt(0);
			switch (m) {
			case 0, 3, 6:
				System.out.print(num[m] + " ");
				break;
//			case 0:
//			case 3:
//			case 6:
//				System.out.print(num[m] + " ");
//				break;
			}
		}
		sc.close();

		
//3. for, if 문
		char[] cList = new char[10];
		for (int i = 0; i < cList.length; i++) {
			cList[i] = sc.next().charAt(0);
			if (i == 0 || i == 3 || i == 6) {
				System.out.print(cList[i] + " ");
			}
		}
		sc.close();
	}
}
