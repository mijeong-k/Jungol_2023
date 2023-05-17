package q633;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean c = true;
		do {
			System.out.println("1. Korea\n" + "2. USA\n" + "3. Japan\n" + "4. China");
			System.out.print("number? ");
			int num = sc.nextInt();
			System.out.println();
			if (0<num&&num<5) {
				switch (num) {
				case 1:
					System.out.println("Seoul");
					break;
				case 2:
					System.out.println("Washington");
					break;
				case 3:
					System.out.println("Tokyo");
					break;
				case 4:
					System.out.println("Beijing");
					break;
				}
				System.out.println();
			} else {
				System.out.println("none");
				c = false;
				break;
			}
		} while (c);
		sc.close();
		
//		int inp = 0;
//		do {
//			inp = sc.nextInt();
//			switch (inp) {
//			case 1, 2, 3, 4:
//				System.out.println("1~4입력");
//				break;
//			}
//		} while (1 <= inp && inp <= 4);
//		System.out.println("none");
//		sc.close();
	}

}

