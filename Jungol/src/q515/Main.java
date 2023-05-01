package q515;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		if ((1 <= num1 && num1 <= 500) && (1 <= num2 && num2 <= 500)) {
			if (num1 > num2) {
				System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
				System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
			} else {
//				int m = num2 - num1;
//				num2 = num2 - m;
//				num1 = num1 + m;

				// 'swap'
				int tmp = num1;
				num1 = num2;
				num2 = tmp;
				System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
				System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
			}
		} else {
			System.out.println("입력한 수가 500이 넘습니다.");
		}

	}

}
