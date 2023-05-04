package q9017;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 실수를 입력하시오.");
		double dinp1 = sc.nextDouble();
		double dinp2 = sc.nextDouble();
		sc.close();

		System.out.printf("x = %.2f\n", dinp1);
		System.out.printf("y = %.2f", dinp2);
	}

}
