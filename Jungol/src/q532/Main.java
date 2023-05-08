package q532;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double dinp1 = sc.nextDouble();
		double dinp2 = sc.nextDouble();
		sc.close();

		if (dinp1 >= 4.0 && dinp2 >= 4.0) {
			System.out.println("A");
		} else if (dinp1 >= 3.0 && dinp2 >= 3.0) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
	}

}
