package q559;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();

		double[] darr = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };

		double sum = 0;
		sum += darr[inp1 - 1] + darr[inp2 - 1];
		System.out.printf("%.1f", sum);

	}

}

