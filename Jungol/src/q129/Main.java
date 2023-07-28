package q129;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Base = ");
			int n1 = sc.nextInt();
			System.out.print("Height = ");
			int n2 = sc.nextInt();
			System.out.printf("%s = %.1f\n", "Triangle width", ((double) n1 * n2 / 2));
			System.out.print("Continue? ");
			char cha = sc.next().charAt(0);

			if (cha == 'Y' || cha == 'y') {
			} else if (cha != 'Y' || cha != 'y') {
				break;
			}
		}
		sc.close();

	}

}
