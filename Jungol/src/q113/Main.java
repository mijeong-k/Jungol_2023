package q113;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		n1 += 5;
		n2 *= 2;

		System.out.println("width = " + n1);
		System.out.println("length = " + n2);
		System.out.println("area = " + (n1 * n2));

	}

}
