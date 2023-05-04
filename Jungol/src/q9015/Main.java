package q9015;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("두 수를 입력하시오. ");
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();

		System.out.printf("%d + %d = %d\n", inp1, inp2, inp1 + inp2);
		System.out.printf("%d * %d = %d\n", inp1, inp2, inp1 * inp2);

	}

}
