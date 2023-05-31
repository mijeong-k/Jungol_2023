package q128;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int cnt = 0;
//		boolean b = true;
//		do {
//			int inp = sc.nextInt();
//			if (inp == 0) {
//				b = false;
//				break;
//			} else if (inp % 3 != 0 && inp % 5 != 0) {
//				cnt++;
//			}
//		} while (b);
//		sc.close();
//		System.out.println(cnt);
//	}

		int inp = 0;
		int cnt = 0;
		do {
			inp = sc.nextInt(); //workload
			if (inp % 3 != 0 && inp % 5 != 0) {
				cnt++;
			}
		} while (inp != 0);
		sc.close();
		System.out.println(cnt);
	}
}
