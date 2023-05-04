package q517;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		double d3 = sc.nextDouble();
		sc.close();

		System.out.printf("%.3f\n%.3f\n%.3f\n", d1, d2, d3);
	}

}
