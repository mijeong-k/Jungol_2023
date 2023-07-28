package q125;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		for (int i = num - 1; 0 <= i; i--) {
			System.out.print(num - i);
			if (i != 0) {
				System.out.print(" ");
			}
		}

	}

}
