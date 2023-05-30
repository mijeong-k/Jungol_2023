package q127;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, cnt = 0;

		// case1
//		while (true) {
//			int inp = sc.nextInt();
//			if (inp < 0 || inp > 100) {
//				break;
//			}
//			sum += inp;
//			cnt++;
//		}
//		sc.close();
//		System.out.println("sum : " + sum);
//		System.out.printf("avg : %.1f", ((double) sum / cnt));

		
		// case2
//		while (true) {
//		int inp = sc.nextInt();
//		if (inp>=0 && inp <= 100) {
//			sum += inp;
//			cnt++;
//		} else {
//			break;
//		}
//	}sc.close();
//		System.out.println("sum : " + sum);
//		System.out.printf("avg : %.1f", ((double) sum / cnt));
		
		
		//case3
		boolean b = true;
		do {
			int inp = sc.nextInt();
			if (inp < 0 || inp > 100) {
				b = false;
			} else {
				sum += inp;
				cnt++;
			}
		} while (b);
		sc.close();
		
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", ((double) sum / cnt));
	}
}
