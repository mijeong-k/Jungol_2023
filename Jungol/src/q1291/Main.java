package q1291;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			if (2 <= s && s <= 9 && 2 <= e && e <= 9) {
				if (s > e) {
					int sum1 = 0;
					for (int m = 1; m <= 9; m++) {
						for (int n = 0; n <= s - e; n++) {
							sum1 = s - n;
							System.out.printf("%d * %d = %2d   ", sum1, m, (sum1 * m));
						}
						System.out.println();
					}break;
				} else if (s <= e) {
					int sum2 = 0;
					for (int m = 1; m <= 9; m++) {
						for (int n = 0; n <= e - s; n++) {
							sum2 = s + n;
							System.out.printf("%d * %d = %2d   ", sum2, m, (sum2 * m));
						}
						System.out.println();
					}
					break;
				}
			} else {
				System.out.println("INPUT ERROR!");
			}
		}sc.close();
	}
}
